package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)  throws IOException {
		
		System.out.println("Podane imiona(tablica imion) zapisuje w pliku i wyœwietla je (odczytuje z pliku)");
		System.out.println("");
		String fileName = "Imiona.txt";
		FileWriter fileWritel = null;
		
		String[] tablica = new String[2];
		Scanner input = new Scanner(System.in);
		
		
		try {
		fileWritel = new FileWriter(fileName);
		for(int i =0;i<tablica.length;i++) {
			System.out.println("Imiê: ");
		fileWritel.write(tablica[i]=input.nextLine());
		fileWritel.write("\n");
		}
		
		}catch(IOException ex){						//Przechwytujemy b³ad
			System.out.println("B£¹d dostêpu");
		}finally {
			fileWritel.close(); 	
		}	
		
		
		input.close();
			
		
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
		
		System.out.println("Iloœæ lini w kodzie: "+il);
		}}


