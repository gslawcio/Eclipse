package AppTest;
import TireWheel.TireWheel;
import ExhaustPart.ExhaustPart;

public class AppTest {

	public static void main(String[] args) {
		
		TireWheel bossal = new TireWheel(10001, "Exxx", "Cool",  11111, 18,235);
		bossal.printInfo();
	
		ExhaustPart tlumik =new ExhaustPart(10001, "Exxx", "Cool",  11111,true);
		tlumik.printInfo();
	}
}
