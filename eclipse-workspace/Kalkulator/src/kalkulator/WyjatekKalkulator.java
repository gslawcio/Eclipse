package kalkulator;

public class WyjatekKalkulator extends RuntimeException {

	public WyjatekKalkulator() {
		
	}

	public WyjatekKalkulator(String message) {
		super(message);
		
	}

	public WyjatekKalkulator(String message, Throwable cause) {
		super(message, cause);
	
	}

	public WyjatekKalkulator(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public WyjatekKalkulator(Throwable cause) {
		super(cause);
		
	}

}
