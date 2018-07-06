import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<Integer> ints = new ArrayList<>();
		
		for(int i=0; i<100; i++) {
			ints.add(i+1);
		}
		
		System.out.println("ints.get(50) = " + ints.get(50));
		System.out.println("Iloœæ elementów na liœcie: " + ints.size());
		System.out.println("Czyszczê tablicê: ");
		ints.clear();
		System.out.println("Iloœæ elementów na liœcie: " + ints.size());

	}

}
