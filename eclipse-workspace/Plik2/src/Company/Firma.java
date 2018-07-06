package Company;
import java.io.Serializable;

import Company.Pracownik;

public class Firma implements Serializable{
	public static final int OSOB = 2;
	private static final long serialVersionUID= 1L ;
	private Pracownik[] firmy;
	
	
	public Firma() {
		firmy = new Pracownik[OSOB];
	}
	public void add(Pracownik p,int i) {
		firmy[i]=p;
	}

	public Pracownik[] getFirmy() {
		return firmy;
	}
	public void setFirmy(Pracownik[] firmy) {
		this.firmy = firmy;
	}
	
}
