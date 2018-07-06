
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
		System.out.println("Podaj liczbê (by wyjœæ wpisz \"exit\"):");
		String input= sc.nextLine();				//wczytujemy co u¿ytkownik wpisa³ 
		if (input.equals(SumNumbers.EXIT)) 		//jeœli wpisa³ exit wychodzimy 
			return;
		try {
		Double num = Double.parseDouble(input);		//zamieniamy liczbê wpisan¹ w typie String na Double
		list.add(num);								//dodajemy liczbê do listy
		}catch(NumberFormatException e)
		{
			System.out.println("Niepoprawny format liczby");
		}
		
		readData(sc,list);							//zwracamy kolejn¹ liczbê i listê liczb
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