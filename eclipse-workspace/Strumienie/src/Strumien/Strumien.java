package Strumien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strumien {

	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);	//lista liczb
	/*
	Stream<Integer> stream = numbers.stream()							// tworzenie strumienia
											.filter(x->x%2==0)			//filtruje liczby podzielne przez 2(wyświetla) oraz
											.filter(x->x>5);			//liczby więsze od 5
	
	
	stream.forEach(System.out::println);					//wyświetla przefiltrowany strumień
	*/
	numbers = numbers.stream().filter(x->x%2==00 && x>5).collect(Collectors.toCollection(ArrayList::new));	//collector zwraca/zapisuje z filtrowaną nową listę do listy
														// lub collect(Collectors.toList())
	numbers.forEach(x ->System.out.print(x+" "));
	
	
	}

}
