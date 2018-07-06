package Company;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Random;

public class Randomize {

	public static void main(String[] args) {
	
		List<Integer> ints = new ArrayList<>();
		Random r = new Random();
		generate(ints, 6, () -> r.nextInt(50));
		
		consume(ints, liczba -> System.out.print(liczba+" "));
		System.out.println();
		System.out.println("------------------------------");
		filtr(ints, pre -> (pre%2==0));
		consume(ints, liczba -> System.out.print(liczba+" "));
		System.out.println();
	/*
		for (Integer in:ints) {
			if(in%2 == 0)
			System.out.print("XX"+" ");
		    else System.out.print(in+" ");
		    }
		    */
		
		
		repeat(10, i -> System.out.println("Odliczanie: " + (9 - i)));
		
}
	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++) action.accept(i);
		}

	private static <T> void filtr(List<T> ints, Predicate<T> pre) {
		for(int i=0;i<ints.size();i++) {
			if(pre.test(ints.get(i))) {
				ints.remove(i);
			}
		}
	}
	
	private static <T> void consume(List<T> list, Consumer<T> consumer) {
		for(T t : list)
			consumer.accept(t);
	}
	
	private static <T> void generate(List<T> list, int num, Supplier<T> sup) {
		for(int i=0; i<num; i++) {
			list.add(sup.get());
		}
	}
}
		
	