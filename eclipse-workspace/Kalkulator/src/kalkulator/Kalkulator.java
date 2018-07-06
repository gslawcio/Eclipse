package kalkulator;

public class Kalkulator {

	
	public int dodaj(int i, int j)  {
		if((long)i+(long)j>Integer.MAX_VALUE) {
			
			throw new PrzekroczenieZakresu();
		}
		return i+j;
	}

	public int podziel(int i, int j) {
		if (j == 0) {
			throw new DzieleniePrzezZero();
		}
		return i/j;
	}
}
