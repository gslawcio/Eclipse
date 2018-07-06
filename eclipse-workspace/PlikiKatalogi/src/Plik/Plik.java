package Plik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Plik {

	public static void main(String[] args) throws IOException { //inforuje nasz ¿ê mo¿ê rzuciæ wyj¹tkiem.Jeœli mamy "finally" throws jest wymagane
		
		String fileName = "Plik.txt";	//Definiujemy plik
		FileWriter fileWritel = null; 	//obiekt "fileWritel", przez któy przesy³¹my strumieñ danych. Na pocz¹tek null.
		
		try {
		fileWritel = new FileWriter(fileName);	//nowy obiekt, typu fileWritel, do którego przekazujê argument fileName
												//trzabe obs³u¿yæ wyj¹tek IOExeption.
		fileWritel.write("Tekst 1\n");			//  "\n"-nak nowego wiersza 
		fileWritel.write("Tekst 2\n");
		fileWritel.write("Tekst 3\n");
		fileWritel.write("Tekst 4\n");
		fileWritel.write("Tekst 5\n");
		fileWritel.write("Tekst 6\n");
		fileWritel.write("Tekst 7\n");
		fileWritel.close();
		
		}catch(IOException ex){						//Przechwytujemy b³ad
			System.out.println("B£¹d dostêpu");
		}finally {									//finally - zawsze siê wykonuje
			if(fileWritel == null) {				
				System.out.println("Problem z plikiem");
				//fileWritel.close(); 
			}else
			fileWritel.close(); 				//zamykamy strumieñ danych
			//fileWritel.flush();  				//opró¿niamy bufor danych
		}
	

	BufferedReader bf = null;			//bufor odczytu danych z pliku
	int il = 0;
	try {
		bf = new BufferedReader(new FileReader(fileName));
		String linia = null;								//w tej zmiennej bêdzie znajdowaæ siê to co odczytamy
		
		do {
			linia=bf.readLine();
			if(linia != null) {
			System.out.println(linia);
			il++;
			}
		}while(linia != null);	
	}catch(IOException ex) {
		System.out.println("B³¹d dostêpu");
		
	}finally {
		
		bf.close();
		}
	System.out.println("Iloœc lini w kodzie: "+il);
	}
}
