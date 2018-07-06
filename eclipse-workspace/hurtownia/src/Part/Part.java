package Part;

public class Part {

	protected int nrId, serialNr;
	protected String Producent, Model;
	
	public Part() {
		
	}
	
	public Part(int nrId, String Producent, String Model, int serialNr) {
		this.nrId = nrId;
		this.Producent = Producent;
		this.Model = Model;
		this.serialNr = serialNr;
	}
	public void printInfo() {
		System.out.println("Z klasy Car /////////////////////");
	}
}
