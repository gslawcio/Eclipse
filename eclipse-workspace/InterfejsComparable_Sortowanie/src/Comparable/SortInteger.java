package Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class SortInteger {
	public static void main(String[] args) {
	
		 Integer[] numbers = {1, 5, 10, 19, 102, 43, 25, 36, 31,
	                99, 9, 77, 7, 66, 6, 55, 44, 33, 1098, 1111};
		 
		 System.out.println("Nieposortowana");
		System.out.println(Arrays.toString(numbers));
		 
		System.out.println("----------------------");
		
		System.out.println("Posortowana");
		
		Arrays.sort(numbers);
		for(Integer ints: numbers) {
			 System.out.print(ints+" ");
		 }
		
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println("Posortowana");
		for(int i=numbers.length-1;i>=0;i--) {
			 System.out.print(numbers[i]+" ");
		 }
		
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println("Posortowana - Arrays.sort");
		
	    Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
			
	    System.out.println("Posortowana malej¹co: ");
        System.out.println(Arrays.toString(numbers));
		
}
}
