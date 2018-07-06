package Strumien;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strumien3_1 {

	public static final int DIVIDER = 10;
	
	public static void main(String[] args) {
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1);
		
													//przez nazwę klasy
		List <Integer> squareNumbers = numStream.map(Strumien3_1::squale).limit(100).collect(Collectors.toList());
		Set<Integer> biggerThan5 = squareNumbers.stream().filter(Strumien3_1::isDivdedBy).map(Strumien3_1::divide).collect(Collectors.toCollection(TreeSet<Integer>::new));
		
		System.out.println("List");
		squareNumbers.forEach(x -> System.out.print(x+" "));
		System.out.println("\nSet");
		biggerThan5.forEach(x -> System.out.print(x+" "));

	}
	public static int squale(int x) {		//metoda przyjmuje argument x i mnoży go przez jego wartość
		return x*x;
	}
	public static boolean isDivdedBy(int x) {	//zwraca wartość true lub false. Sprawdza warunek czy liczba jest podzielna przez DIVIDE =10
		return x%DIVIDER == 0;
	}
	public static int divide(int x) {	//dzieli x przez DIVIDE
		return x/DIVIDER;
	}
}
