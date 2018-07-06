package pk;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Odczyt3Java9 {

	public static void main(String[] args) throws IOException {
		String fileName = "tekstFile.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        
        try (
            fileReader;
            reader;
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Iloœæ wierszy w pliku: " + lines);
        }


	}

}
