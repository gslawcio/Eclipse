package TireWheel;
import Part.Part;
public class TireWheel extends Part {

	private int rozmiar;
	private int szerokosc;
	
	public TireWheel(){
		
	}
	
	public TireWheel(int nrId, String Producent, String Model, int serialNr,int rozmiar, int szerokosc) {
		super(nrId, Producent, Model, serialNr);
		this.rozmiar = rozmiar;
		this.szerokosc = szerokosc;
	}
	public void printInfo() {
		String info = rozmiar +"   " +szerokosc+ " nrId: "+nrId+" Producent: "+Producent+" Model: "+Model;
		System.out.println("Klasa TireWheel   Rozmiar: "+ info);
		
	}

}
