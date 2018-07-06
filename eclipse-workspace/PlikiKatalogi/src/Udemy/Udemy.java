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
		System.out.println("Czy mo�na zapisywa� do niego: "+plik.canWrite());
		System.out.println("Czy mo�na go uruchomi�: "+plik.canExecute());
		System.out.println("Czy mo�na go odczytywa�: "+plik.canRead());
		System.out.println("Czy jest ukryty: "+plik.isHidden());
		System.out.println("Czy jest plikiem: "+plik.isFile());
		System.out.println("Ostatnia modyfikacja: "+new Date(plik.lastModified()));
		System.out.println("D�ugo�� pliku (ilo�� znajk�w): "+plik.length());
		System.out.println("___________________");
		System.out.println(plik.getAbsolutePath());		//�cie�ka pliku
	
		
		//plik.delete();		usuwanie pliku
		}catch (IOException ex) {
			System.out.println("B��d tworzenia pliku");
		}

	//	System.out.println(System.getProperty("java.home"));
		
		
	}

}
