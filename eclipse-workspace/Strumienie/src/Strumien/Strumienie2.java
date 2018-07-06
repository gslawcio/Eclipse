package Strumien;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Strumienie2 {

	public static void main(String[] args) {
		Stream<String> strings = Stream.of("a","bb","ccc","dddd","eeeee","fffff","ggggggg");		//tworzenie strumienia
		strings.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
		//zapisane kapitalikami(dużymi literami), 
		//wykorzystajmy metodę klasy String toUpperCase()- zamienia na duże litery   oraz    metodą map() strumienia
		
		
		
		//    NA STRUMIENIU MOŻNA WYKOŃAĆ JEDNĄ METODĘ
		
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1);			//strumień liczb nieskończonych od 0 do n
		
		//List<Integer> numbers = numStream.filter(x -> x%2 == 0).limit(100).collect(Collectors.toList());//strumień liczb "numStream" filtrujemy - wyświetlamy 100 pierwszych liczb podielnych przez 2
		
		//numbers.forEach(x ->System.out.print(x+" "));
		
		
		List<Integer> squareNumbers = numStream.map(x -> x*x).limit(10).collect(Collectors.toList());  //10 pierwszych liczb do kwadratu
		squareNumbers.forEach(x -> System.out.print(x+" "));
		
	//	List<Integer> negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());
	//	negativeNumbers.forEach(x -> System.out.print(x+" "));
		
	}
	}

