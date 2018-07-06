package Comparable;

import java.util.Arrays;

public class ProductCatalog {

	public static void main(String[] args) {

		Product[] products = new Product[7];
		products[0] = new Product("Amino", "Zupa pomidorowa", "Zupy");
		products[1] = new Product("Amino", "Zupa ogórkowa", "Zupy");
		products[2] = new Product("WINIARY", "Zupa pomidorowa", "Zupy");
		products[3] = new Product("WINIARY", "Zupa pomidorowa", "Zupy b³yskawiczne");
		products[4] = new Product("WINIARY", "Rosó³", "Zupy");
		products[5] = new Product("Knorr", "Placki ziemniaczane", "Dania obiadowe");
		products[6] = new Product("Knorr", "Racuchy", "Dania obiadowe");
		
		System.out.println("Nieposortowana");
		for(Product pr: products) {
			System.out.println(pr);
		}
		System.out.println("Posortowana");
		Arrays.sort(products);
		for(Product pr: products) {
			System.out.println(pr);
		}
		
	}

}
