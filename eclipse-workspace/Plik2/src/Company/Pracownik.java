package Company;

import Company.Osoba;
public class Pracownik extends Osoba {
	private static final long serialVersionUID=1L ;
	private double wyplata;

	public Pracownik(String fName,String lName,double wyplata) {
		super(fName,lName);
		setWyplata(wyplata);
	}

	public double getWyplata() {
		return wyplata;
	}
	
	public void setWyplata(double wyplata) {
		this.wyplata = wyplata;
	}
	public String toString() {
		return super.toString()+" wyp³ata: "+wyplata;
	}
}
