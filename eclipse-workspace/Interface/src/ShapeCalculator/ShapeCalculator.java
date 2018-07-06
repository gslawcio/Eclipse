package ShapeCalculator;
//import java.util.Locale;
import java.util.Scanner;

import java.util.InputMismatchException;

import Rectangle.Rectangle;
import Circle.Circle;



public class ShapeCalculator {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
	//	sc.useLocale(Locale.US);
		
		double a = 0;
		double b = 0;
		boolean readComplete = false;
		
		while (!readComplete) {
			System.out.println("Podaj informacje o prostok�cie.");
			System.out.println("Podaj d�ugo�� boku A: ");
			
		try {
				a = sc.nextDouble();
				sc.nextLine();
				System.out.println("Podaj d�ugo�� boku B: ");
				b = sc.nextDouble();
				sc.nextLine();
				readComplete=true;
				
				Rectangle kw = new Rectangle(a,b);
				
				System.out.println(kw.toString());
				
			}catch (InputMismatchException e) {
					
					System.out.println("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
					sc.nextLine();
					System.out.println("");
		}
		}
		
	
		
	System.out.println();
	System.out.println("Pole i obw�d Circle");
	double r;
	System.out.println("Podaj promie�:");
	r=sc.nextDouble();
	Circle kolo = new Circle(r);
	System.out.println("Pole powierzchni:  "+kolo.calculateArea());
	System.out.println("obw�d: "+kolo.calculatePerimeter());
	sc.close();	
	}
}
