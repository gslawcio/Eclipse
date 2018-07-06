package Strumien;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Strumien3 {

	public static void main(String[] args) {
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1);
	/*	
		List<Integer> numbers = numStream.filter(x -> x>100 && x<1000).filter(x -> x%5==0).limit(10).map(x -> x*3).collect(Collectors.toList());
		
		numbers.forEach(x -> System.out.println(x+" "));
		// filtruje strumień - wybiera liczby większe od 100 i mniejsze od 1000 , następnie z tych liczby podzielne przez 5 , pobiera 10 pierwszych , mnoży je przez 3 i zapisuje
		*/
		
		List <Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());
		Set<Integer> biggerThan5 = squareNumbers.stream().filter(x -> x%10 == 0).map(x -> x/10).collect(Collectors.toCollection(TreeSet<Integer>::new));
		
		System.out.println("List");
		squareNumbers.forEach(x -> System.out.println(x+" "));
		System.out.println("\nSet");
		biggerThan5.forEach(x -> System.out.println(x+" "));
	}

}
