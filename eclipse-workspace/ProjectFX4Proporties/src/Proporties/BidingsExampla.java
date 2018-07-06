package Proporties;


import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import javafx.beans.binding.When;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BidingsExampla {

	public static void main(String[] args) {
		bidings();
		
	}

	private static void bidings() {
		DoubleProperty a =new SimpleDoubleProperty(3.0);
		IntegerProperty b = new SimpleIntegerProperty(4);
		
		System.out.println("Dziłałania liczbowe:");
		
		NumberBinding results = a.add(b);					// interfejs NumberBilding 
		System.out.println("wynik: "+ results.doubleValue());
		
		results = a.divide(b);		// dzielenie
		System.out.println("wynik: "+ results.doubleValue());
		
		results = a.multiply(b);	//mnożenie
		System.out.println("wynik: "+ results.doubleValue());
		
		results = a.negate();		// zamiana na liczbę ujemną
		System.out.println("wynik a: "+ results.intValue());

		BooleanBinding value = a.isEqualTo(b);		
		System.out.println("Czy A jest równe b : "+ value.get());
		
		System.out.println("Czy a jest nierówne b: "+ a.isNotEqualTo(b).get());
		System.out.println("Czy a większe od b: "+ a.greaterThan(b).get());
		System.out.println("Czy a większe lub równe niż b: "+a.greaterThanOrEqualTo(b).get());
		System.out.println("Czy a jest mniejsze niż b: "+a.lessThan(b).get());
		System.out.println("Czy a jest mniejsze lub równe b : "+a.lessThanOrEqualTo(b).get());
	
		//Działanie na Stringach
		StringProperty sp = new SimpleStringProperty("To jest ");
		StringProperty sp1 = new SimpleStringProperty("kurs ");
		StringProperty sp2 = new SimpleStringProperty("java FX");
		
		StringExpression se = sp.concat(sp1).concat(sp2);
		System.out.println(se.get());
		
		//Użycie klasy WHEN
		System.out.println("Użycie klasy WHEN");
		StringBinding result = new When(a.lessThan(b)).then("mniejsza").otherwise("większa");
		System.out.println("Wynik sprawdenia: "+result.get());
		
		System.out.println("Formator");
		DoubleProperty longDouble = new SimpleDoubleProperty(2.3434355546576767);
		StringExpression outPut = Bindings.format("Format liczby double (%.3f)",longDouble);
		System.out.println(outPut.get());
		
	}
}
