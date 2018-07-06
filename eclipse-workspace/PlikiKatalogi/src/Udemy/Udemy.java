package Udemy;

import java.io.File;
import java.io.IOException;
import java.util.Date;



public class Udemy {

	public static void main(String[] args)  {
		
		File katalog = new File("katalog1"+File.separator+"katalog2"+File.separator+"katalog3");
		
		katalog.mkdirs();		//Tworzy katalogi. mkdir- tworzy katalog
		

		try {
		File plik = new File("plik.txt");
		if(!plik.exists()) {
			plik.createNewFile();
			}else 
				System.out.println("Plik istnieje");
		System.out.println("Czy mo¿na zapisywaæ do niego: "+plik.canWrite());
		System.out.println("Czy mo¿na go uruchomiæ: "+plik.canExecute());
		System.out.println("Czy mo¿na go odczytywaæ: "+plik.canRead());
		System.out.println("Czy jest ukryty: "+plik.isHidden());
		System.out.println("Czy jest plikiem: "+plik.isFile());
		System.out.println("Ostatnia modyfikacja: "+new Date(plik.lastModified()));
		System.out.println("D³ugoœæ pliku (iloœæ znajków): "+plik.length());
		System.out.println("___________________");
		System.out.println(plik.getAbsolutePath());		//œcie¿ka pliku
	
		
		//plik.delete();		usuwanie pliku
		}catch (IOException ex) {
			System.out.println("B³¹d tworzenia pliku");
		}

	//	System.out.println(System.getProperty("java.home"));
		
		
	}

}
