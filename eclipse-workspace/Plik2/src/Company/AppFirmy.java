package Company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AppFirmy {
	public static void main(String[] args) {
		Firma obFirma = new Firma();
		AppFirmy app =new AppFirmy();
		
		app.wczytywaniaDanych(obFirma);
		app.readData(obFirma);
	}

	String fileName = "DanePr.txt";


private void readData(Firma obFirma) {
	try (	FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);) {

		obFirma = (Firma) ois.readObject();
		
		for(int i=0; i<Firma.OSOB; i++) {
			System.out.println(obFirma.getFirmy()[i]);
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
public void wczytywaniaDanych(Firma obFirma) {
	Scanner sc = new Scanner(System.in);
	
	try {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i=0;i<Firma.OSOB;i++) {
			System.out.println("WprowadŸ imiê: ");
			String fName = sc.nextLine();
			System.out.println("WprowadŸ nazwisko: ");
			String lName = sc.nextLine();
			System.out.println("WprowadŸ wyp³atê: ");
			double wyplata = sc.nextDouble();
			sc.nextLine();
		
			obFirma.add(new Pracownik(fName, lName, wyplata),i);			
		}
		
		oos.writeObject(obFirma);
		sc.close();
		oos.close();
		fos.close();
	}catch(IOException ex){						
		System.out.println("B³¹d dostêpu");
		ex.printStackTrace();
	}
}
}