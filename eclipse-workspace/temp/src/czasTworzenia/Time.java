package czasTworzenia;

public class Time {
	public static void main(String[] args) {
		long time1, time2;
		
		long startTime = System.nanoTime();
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<1000; i++) {
			builder.append(i);				// append() - metoda w wielu przeci��onych wersjach, kt�ra jako parametr przyjmuje napisy, liczby lub obiekty i dokleja je do budowanego napisu
			builder.append(" ");
		}
		String numbers = builder.toString();
		time1 = System.nanoTime()-startTime;
		System.out.println("Time1: "+time1);
		System.out.println(numbers);
		
		startTime = System.nanoTime();
		String numbers2 = "";
		for(int i=0; i<1000; i++) {
			numbers2 = numbers2 + i + " ";
		}
		time2 = System.nanoTime()-startTime;
		System.out.println("Time2: "+time2);
		System.out.println(numbers2);
		
		System.out.println("Time2 / Time1: "+time2/time1);
		
		
		String words = "  Jeden dwa trzy cztery pi�� sze�� siedem ";
		String words1 = "BIblioteka";
		String sub1 = words.substring(2, 7);
		String sub2 = words.replaceAll("trzy", "hehe");
		String sub3 = words.trim();
		char charat = words.charAt(2);
		String sub4 = words1.toUpperCase();
		String sub5 = words1.toLowerCase();
	
		//-insert() - r�wnie� przeci��ona w wielu wersjach. Pozwala wstawi� konkretny znak, warto�� lub ci�g znak�w do istniej�cego ci�gu znak�w. 
		// Jako pierwszy argument podajemy index (licz�c od 0), na kt�ry chcemy co� wstawi�, jako drugi parametr warto�� jaka ma zosta� wstawiona
		
		System.out.println(words);
		System.out.println("words.substring(2, 7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"trzy\", \"hehe\")");
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		System.out.println(sub4);
		System.out.println(sub5.length());
		
	}
}