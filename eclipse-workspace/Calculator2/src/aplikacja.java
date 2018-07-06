import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;
import calculator.Calc;


public class aplikacja {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		double a = 0;
		double b = 0;
		String operator = null;

		boolean readComplete = false;
		while (!readComplete) {
			try {
				System.out.println("Podaj pierwsz¹ liczbê: ");
				a = input.nextDouble();
				input.nextLine();
				System.out.println("Podaj operator arytmetyczny (+, -, * lub /): ");
				operator = input.nextLine();
				System.out.println("Podaj drug¹ liczbê: ");
				b = input.nextDouble();
				readComplete = true;
			} catch(InputMismatchException e) {
				System.out.println("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
				input.nextLine();
			}
		}

		Calc calc = new Calc();
		double result = 0;
		boolean calculationComplete = false;
		try {
			result = calc.calculate(a, b, operator);
			calculationComplete = true;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
		if(calculationComplete) {
			System.out.println(a + operator + b + " = " + result);
		} else {
			System.out.println("Nie mo¿na by³o obliczyæ wyniku wyra¿enia " + a + operator + b);
		}

		input.close();
	}
}