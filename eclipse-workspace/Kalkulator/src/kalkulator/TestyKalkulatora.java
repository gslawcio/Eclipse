package kalkulator;
import kalkulator.Kalkulator;
public class TestyKalkulatora {

	public static void main(String[] args) {
	
		Kalkulator kalkulator = new Kalkulator();
		
		int wynik =0;
		
		try {int wynikDodawania= kalkulator.dodaj(Integer.MAX_VALUE, Integer.MAX_VALUE);
			wynik = kalkulator.podziel(5,0);
			
		} catch (DzieleniePrzezZero e) {
			
			e.printStackTrace();
			System.out.println("Nie wolno dzieliæ przez 0");
		}
		catch(PrzekroczenieZakresu pz) {
			
			pz.printStackTrace();
		}
		catch(WyjatekKalkulator wk) {
			wk.printStackTrace();
		}
		
		 System.out.println(wynik);
		 System.out.println(Integer.MAX_VALUE);

	}
	
	
	//int wynikDodawania= kalkulator.dodaj(Integer.MAX_VALUE, Integer.MAX_VALUE);
//	wynik = kalkulator.podziel(5,0);

}
