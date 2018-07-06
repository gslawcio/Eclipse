
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
	
	public static final String EXIT="exit";
	
	public static void main(String[] args) {
		List<Double> numbers = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		
		readData(sc,numbers);
		printList(numbers);
		
	}
	
	static void readData(Scanner sc, List<Double> list) {
		System.out.println("Podaj liczb� (by wyj�� wpisz \"exit\"):");
		String input= sc.nextLine();				//wczytujemy co u�ytkownik wpisa� 
		if (input.equals(SumNumbers.EXIT)) 		//je�li wpisa� exit wychodzimy 
			return;
		try {
		Double num = Double.parseDouble(input);		//zamieniamy liczb� wpisan� w typie String na Double
		list.add(num);								//dodajemy liczb� do listy
		}catch(NumberFormatException e)
		{
			System.out.println("Niepoprawny format liczby");
		}
		
		readData(sc,list);							//zwracamy kolejn� liczb� i list� liczb
	}
	
	static void printList(List<Double> list) {
		double suma = 0;
		
		for(double d:list) {
			System.out.print(d+" + ");
		}
		
		System.out.print("= ");
		
		for(double d:list) {
			suma +=d;
		}
		System.out.println(suma);
	}
}