package Enigma;
import java.util.Scanner;

public class Enigma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj liczbê wyrazów: ");
		int wordsNumber = input.nextInt();
		input.nextLine();
		
		String[] words = new String[wordsNumber];
		
		for(int i=0; i<wordsNumber; i++) {
			System.out.println("Podaj kolejne s³owo: ");
			words[i] = input.nextLine();
		}
		
		StringBuilder build = new StringBuilder();
		for(int i=0; i<wordsNumber; i++) {
			build.append(words[i].charAt(words[i].length()-1 ));
		/*	-append() - metoda w wielu przeci¹¿onych wersjach, która jako parametr przyjmuje napisy, liczby lub obiekty i dokleja je do budowanego napisu
			-charAt() - zwraca znak w aktualnym ci¹gu znaków, jako parametr przyjmuje index (licz¹c od 0).
			
		*/
		}
		
		System.out.println("Nowe s³owo: " + build.toString());
		
		input.close();
	}
}