package ExhaustPart;
import Part.Part;
public class ExhaustPart extends Part {

	boolean standardEmisji = false;
	
	public ExhaustPart() {
		
	}
	
	public ExhaustPart(int nrId, String Producent, String Model, int serialNr,boolean standardEmisji) {
		super(nrId, Producent, Model, serialNr);
		this.standardEmisji = standardEmisji;
	}
	
	public void printInfo() {
		
		super.printInfo();
		
		String info = " nrId: "+nrId+" Producent: "+Producent+" Model: "+Model+"  Europ.Standard spalin = "+standardEmisji;
		System.out.println("Klasa ExhaustPart   Info: "+ info);
		
	}
}
