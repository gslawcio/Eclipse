package PersonDatabase;

import java.util.Arrays;

public class PersonDatabase {
	
	private int emptyPlace;
	private final int INITIAL_CAPACITY=1;
	private Person[] persons;
	
	public PersonDatabase() {
		persons = new Person[INITIAL_CAPACITY];
		emptyPlace = 0;
	}
	
	public void add(Person p) {						//Metoda add() przyjmuje jako parametr obiekt klasy Person.
		if(emptyPlace == persons.length ) {			//W przypadku, gdy w tablicy nie ma miejsca, czyli przy dodawaniu 2 obiektu, 
													//tablica jest zastêpowana now¹ tablic¹ o 2 razy wiêkszym rozmiarze, 
	persons=Arrays.copyOf(persons, persons.length*2); //ale ju¿ wstêpnie wype³niona skopiowanymi obiektami z poprzedniej tablicy 
													  //- przydatna okaza³a siê metoda copyOf() z klasy Arrays
										}			
	
	
		persons[emptyPlace]=p;			//dodajemy nowy obiekt na pierwsze wolne miejsce w tablicy oraz inkrementujemy zmienn¹ emptyPlace
		emptyPlace++;
	}
	
	public Person get(int index) throws ArrayIndexOutOfBoundsException {
		if (index >= emptyPlace || index < 0) {
			throw new ArrayIndexOutOfBoundsException("B³êdny parametr");
		}
		return persons[index];
	}
	public void remove(Person p) {
		if (p == null)
			return;

		final int NOT_FOUND = -1;
		int found = NOT_FOUND;
		int i = 0;
		while (i < persons.length && found == NOT_FOUND) {
			if (p.equals(persons[i])) {
				found = i;
			} else {
				i++;
			}
		}

		if (found != NOT_FOUND) {
			System.arraycopy(persons, found + 1, persons, found, persons.length - found - 1);
			emptyPlace--;
		}
	}
	
	public int size() {
		return emptyPlace;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PersonsDatabase size: " + size());
		sb.append("\n");
		for (int i = 0; i < emptyPlace; i++) {
			sb.append(persons[i].toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
