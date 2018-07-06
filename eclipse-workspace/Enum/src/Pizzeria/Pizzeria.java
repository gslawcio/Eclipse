package Pizzeria;
import java.util.Scanner;
import Pizza.Pizza;
public class Pizzeria {

	public static void main(String[] args) {
		
		System.out.println("Dostêpne pizze:");
		for(Pizza p: Pizza.values()) {
			System.out.println(p);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Jak¹ pizzê wybierasz?");
		Pizza pizza = Pizza.valueOf(input.nextLine());
		
		System.out.println("Dziêkujemy za zamówienie pizzy " + pizza.name());
		input.close();
	}
}
