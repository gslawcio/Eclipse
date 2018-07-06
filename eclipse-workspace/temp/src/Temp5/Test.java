package Temp5;
	import java.util.InputMismatchException;
	import java.util.Scanner;
public class Test {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj liczbê: ");
			int number = 0;
			boolean error = true;
			
			while(error) {
							try {
									number = sc.nextInt();
									error = false;
								} catch(InputMismatchException ex) {
																	ex.printStackTrace(); // OPIS B£ÊDU
																	sc.nextLine();
																	System.out.println("Nie poda³eœ liczby ca³kowitej, spróbuj jeszcze raz: ");
																	System.out.println();
																	
																	}
						 }
			System.out.println("Poda³eœ: " + number);
			sc.close();
		
	}
}
