package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
				+ "działania drukarki i może również zawierać informacje pomocne podczas "
				+ "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";

		List<String> words = Arrays.asList(sentence.split(" "));		//przekształcanie w listę
		
		System.out.println("Lista oryginalna: ");
		printCollection(words);
		
		Collections.shuffle(words);
		printCollection(words);
		
		
		
		
	}
	
	private static void shuffle(List<String> words) {
		// TODO Auto-generated method stub
		
	}

	private static void printCollection(Collection<String> collection) {
		for(String s: collection) {
			System.out.print(s + "; ");
		}
		System.out.println();
	}
}
/*
binarySearch() - w zadanej (posortowanej) liście wyszukuje element podany jako drugi argument
copy() - pozwala skopiować wszystkie elementy jednej listy do innej
fill() - podmienia wszystkie elementy podanej listy obiektem przekazanym jako drugi argument
frequency() - zlicza ilość wystąpień w kolekcji zadanego obiektu
min() / max() - zwraca najmniejszą lub największą wartość w kolekcji (zgodnie z naturalnym porządkiem lub przekazanym komparatorem)
reverse() - odwraca kolejność elementów w liście
shuffle() - miesza elementy w liście
swap() - zamienia miejscami dwa elementy w liście
*/