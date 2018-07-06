package Company;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonOperator {

	public static void main(String[] args) {

		List<Person> person = new ArrayList<>();
		person.add(new Person("Ania","Lędiak",15));
		person.add(new Person("Żaneta","Kowalik",16));
		person.add(new Person("Barbara","Adamowicz",20));
		person.add(new Person("Katarzyna","Obuch",18));
		person.add(new Person("Iwona","Zana",44));
		person.add(new Person("Angelika","Iglak",33));
		
		int i=0;
		for(Person p:person){
			System.out.println(p);
			i++;
		}
		System.out.println("Ilość osób: "+i);
	System.out.println("-----------------------------------------");
	
	consumeList(person,p -> System.out.println(p));								//wywołanie metody consumerList z dwoma argumentami I-lista person 
	System.out.println("-----------------------------------------------");		//  II- to funkcja która jako argument przyjmuje obiekt typu Person i go wyświetla
	
	applyToList(person, p -> {							//Jako pierwszy jej argument ponownie przekazaliśmy naszą listę, a jako drugi przekazaliśmy funkcję przyjmującą argument typu Person 
		p.setAge(p.getAge() + 1);						//i zwracającą ten sam obiekt, ale z wiekiem zwiększonym o 1.
		return p;
	});
	consumeList(person,p -> System.out.println(p));		
	System.out.println("____________________________");
	
	filterByPredicate(person, p -> p.getAge() > 18);			//przefiltruj listę zgodnie z przekazanym predykatem
	
	}

	private static <T> void consumeList(List<T> list, Consumer<T> consumer) {	//metoda generyczna. Przyjmuje jako I-argument listę person a drugi 
		for (T t : list) {														//przyjmuje interfejs funkcyjny consumer<T>, który posiada metode accept
			consumer.accept(t);													//przyjmuje argument typu T, ma za zadanie wykonać pewną operację i nie zwraca wyniku
		}		
	}	
													//Function<T, R> - posiada metodę apply(T t) - reprezentuje funkcję przyjmującą argument typu T i zwracającą argument typu R
	private static <T> void applyToList(List<T> list, Function<T, T> pre) {	//Przyjmuje jako I-argument listę person a drugi funkcję typu T i zwraca też ten sam typ T
		for (int i = 0; i < list.size(); i++) {
			list.set(i, pre.apply(list.get(i)));			//Wywołanie list.set(i, pre.apply(list.get(i))) należy rozumieć jako "podmień element listy na pozycji
		}													// i obiektem zwróconym przez funkcję pre, której jako argument przekazujemy obiekt list.get(i)".
	}
						//Predicate<T> - posiada metodę test(T t) - przyjmuje argument typu T i zwraca wartość typu boolean
	private static <T> void filterByPredicate(List<T> list, Predicate<T> pre) {
		for (T t : list) {									// w pętli sprawdzamy czy obiekt spełnia naszz predykat czyli czy wiek jest >18
			if (pre.test(t)) {								//jeli zostaje wrócona wartość true - wyświetlamy go na ekram jeśli false nic nie robimy
				System.out.println(t);
			}
		}
	}
	
}
