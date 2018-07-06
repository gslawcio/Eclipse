package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda {

	public static void main(String[] args) {

		textStringPrinter(t -> System.out.println(t));
		System.out.println("------------------------");
		InterfaceLambda dodaj = (a,b) -> a+b;
		InterfaceLambda odejmij = (a,b) -> a-b;
		InterfaceLambda podziel = (x, y) -> x/y;
		 System.out.println(dodaj.oblicz(2, 4));
		 System.out.println(odejmij.oblicz(4, 3));
		 System.out.println(podziel.oblicz(4, 2));
		System.out.println("-------------------");
		
		String oryginal ="DUŻY NAPIS STRING";
		Function<String,String> funkcja = (String str) -> str.toLowerCase().toLowerCase();
		String napis = funkcja.apply(oryginal);
		System.out.println(napis);
		
		
	
	}
	static void textStringPrinter(Consumer<String> printer) {
		printer.accept("tekst");
	}
}
