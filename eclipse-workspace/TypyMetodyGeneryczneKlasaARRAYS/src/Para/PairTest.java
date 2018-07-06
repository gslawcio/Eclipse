package Para;

public class PairTest {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>("Ania", 1987);
		Pair<Double, Double> p2 = new Pair<>(20.5, 31.7);
		Pair<String, String> p3 = new Pair<>("Jan", "Kowalski");
		
		PairTest.printPair(p1);
		PairTest.printPair(p2);
		PairTest.printPair(p3);
		
		
	}
	static <T, V> void printPair(Pair<T, V> pair) {
		System.out.println("<" + pair.getT() + " ; " + pair.getV() + ">");
	}
	
}
