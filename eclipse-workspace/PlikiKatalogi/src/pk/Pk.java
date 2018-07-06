package pk;
import java.io.File;
import java.io.IOException;
public class Pk {
	public static void main(String[] args) {
		String fileName = "Plik.txt";
		File file = new File(fileName);
		
		boolean fileExists = file.exists();
		if(!fileExists) {
			try {
				fileExists = file.createNewFile();
			} catch (IOException e) {
				System.out.println("Nie uda³o siê utworzyæ pliku");
			}
		}
		
		if(fileExists)
			System.out.println("Plik " + fileName + " istnieje lub zosta³ utworzony");
	}
}
