package Plik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Plik {

	public static void main(String[] args) throws IOException { //inforuje nasz �� mo�� rzuci� wyj�tkiem.Je�li mamy "finally" throws jest wymagane
		
		String fileName = "Plik.txt";	//Definiujemy plik
		FileWriter fileWritel = null; 	//obiekt "fileWritel", przez kt�y przesy��my strumie� danych. Na pocz�tek null.
		
		try {
		fileWritel = new FileWriter(fileName);	//nowy obiekt, typu fileWritel, do kt�rego przekazuj� argument fileName
												//trzabe obs�u�y� wyj�tek IOExeption.
		fileWritel.write("Tekst 1\n");			//  "\n"-nak nowego wiersza 
		fileWritel.write("Tekst 2\n");
		fileWritel.write("Tekst 3\n");
		fileWritel.write("Tekst 4\n");
		fileWritel.write("Tekst 5\n");
		fileWritel.write("Tekst 6\n");
		fileWritel.write("Tekst 7\n");
		fileWritel.close();
		
		}catch(IOException ex){						//Przechwytujemy b�ad
			System.out.println("B��d dost�pu");
		}finally {									//finally - zawsze si� wykonuje
			if(fileWritel == null) {				
				System.out.println("Problem z plikiem");
				//fileWritel.close(); 
			}else
			fileWritel.close(); 				//zamykamy strumie� danych
			//fileWritel.flush();  				//opr�niamy bufor danych
		}
	

	BufferedReader bf = null;			//bufor odczytu danych z pliku
	int il = 0;
	try {
		bf = new BufferedReader(new FileReader(fileName));
		String linia = null;								//w tej zmiennej b�dzie znajdowa� si� to co odczytamy
		
		do {
			linia=bf.readLine();
			if(linia != null) {
			System.out.println(linia);
			il++;
			}
		}while(linia != null);	
	}catch(IOException ex) {
		System.out.println("B��d dost�pu");
		
	}finally {
		
		bf.close();
		}
	System.out.println("Ilo�c lini w kodzie: "+il);
	}
}
