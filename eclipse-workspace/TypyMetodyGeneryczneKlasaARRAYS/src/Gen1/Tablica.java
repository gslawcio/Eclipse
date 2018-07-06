package Gen1;

public class Tablica {

	public static void main(String[] args) {
		String[] sTablica = {"Ala","Ola","Iga"};
		Integer[] iTablica= {1,2,3,4,5};
		Double[] dTablica= {1.2,3.4,4.5};
		
		wypisz(sTablica);
		System.out.println();
		System.out.println("---------------------");
		wypisz(iTablica);
		System.out.println();
		System.out.println("---------------------");
		wypisz(dTablica);
	}

	public static <T> void wypisz(T[] tablica) {
		for(T element: tablica)
			System.out.print(" "+element);
	}
}
