package calculator;

import UnkownOperatorException.UnkownOperatorException;
public class Calc {

	public static final String dzielenie = "/";
	public static final String minus= "-";
	public static final String mnozenie = "*";
	public static final String plus = "+";
	
	public double calculate (double a, double b, String operator) {
		
		double wynik =0;
		
		switch (operator) {
		case(plus):
			wynik = a+b;
		break;
		case (minus):
			wynik = a-b;
		break;
		case (mnozenie):
			wynik = a*b;
		break;
		case (dzielenie):
			if(b == 0) {
				throw new ArithmeticException("Nie mo¿esz dzieliæ przez 0!");
			}
			wynik = a / b;
			break;
		default:
			throw new UnkownOperatorException("Wykorzystujesz niezdefiniowany operator arytmetyczny");
		}
	
	return wynik;
	}
	
}
