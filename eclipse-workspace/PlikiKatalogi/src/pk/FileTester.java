package pk;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileTester {

	public static void main(String[] args) throws IOException {
		 String fileName = "tekstFile.txt";
	        FileReader fileReader = null;
	        BufferedReader reader = null;
	        try {
	            fileReader = new FileReader(fileName);		// utworzenie nowego obiektu BufferedReader jest dosyæ d³ugie - klasa FileReader pozwala pracowaæ na obiekcie File,
	            											//a BufferedReader dodaje do obiektu FileReader dodatkowe metody
	            reader = new BufferedReader(fileReader);
	            String nextLine = null;
	            int lines = 0;
	            while ((nextLine = reader.readLine()) != null) { // z obiektu "reader" zczytujemy ile jest wierszy i przypisujemy kolejne wiersze do "nextLine"
	                System.out.println(nextLine);
	                lines++;
	            }
	            System.out.println("Iloœæ wierszy w pliku: " + lines);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if(reader != null)
	                    reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	}

}
