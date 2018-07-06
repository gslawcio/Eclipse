package Container;

public class GenericTester {

	public static void main(String[] args) {
																		
				Container<Integer> integers = new Container<Integer>();	//definiujemy kontener przechowujï¿½cy liczby caï¿½kowite
				
				integers.setArray(new Integer[10]);						//przypisujemy nowï¿½ tablicï¿½ typu Integer
				
				for(int i=0;i<integers.getArray().length;i++){
				integers.getArray()[i] = i+1;								//do pierwszego elementu przypisujemy liczbï¿½ 5
                                }
				
                                for(int i=0;i<integers.getArray().length;i++){
				System.out.println(integers.get(i));
                                }
                                
                                System.out.println("----------------");
                                    integers.printObjects();
                                    
				Container<String> strings = new Container<String>();	//tworzymy kontener przechowujï¿½cy obiekty String
				
				strings.setArray(new String[7]);						//przypisujemy tablicê typu String
				
				strings.getArray()[0] = "Ania";
				strings.getArray()[1] = "Basia";						//przypisujemy 1 i 2 element tablicy
				strings.getArray()[2] = "2string";
				strings.getArray()[3] = "3string";
				strings.getArray()[4] = "4string";
				strings.getArray()[5] = "5string";
				strings.getArray()[6] = "6string";
				
				System.out.println("----------------");
				strings.printObjects();
				System.out.println("-------------------");
				Integer num = integers.get(0);					//odczytanie danych bez koniecznoœci rzutowania!
				String str = strings.get(0);
				
				
				System.out.println(num);				//wyï¿½wietlenie wartoï¿½ci
				System.out.println(str);
	}

}
