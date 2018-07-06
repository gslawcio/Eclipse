package KlasaARRAYS;
import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
		Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};
		
		System.out.println("Names: ");
		printArray(names);
		
		System.out.println("Numbers: ");
		printArray(numbers);
		System.out.println();
		
		
		System.out.println("Arrays.sort(numbers): ");
		Arrays.sort(numbers);;
		printArray(numbers);
		
		System.out.println("Sortowanie imion");
		Arrays.sort(names);
		printArray(names);
		
		//copyOf
				System.out.println("Numbers2, Arrays.copyOf()");
				Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
				printArray(numbers2);
				System.out.println();
				
				//equals
				System.out.println("Arrays.equals(numbers, numbers2): ");
				System.out.println(Arrays.equals(numbers, numbers2));
				System.out.println();
				
				//fill
				System.out.println("Arrays.fill()");
				String[] strings = new String[5];
				Arrays.fill(strings, "Wacek");
				printArray(strings);
	}

	public static <T> void printArray(T[] arr) {
		for(T t: arr) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

}
