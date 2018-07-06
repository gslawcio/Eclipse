package TestNumbers;
import Numbers.Numbers;
public class TestNumbers {
	  public static void main(String[] args) {
		  Numbers nums = new Numbers();
	        try {
	            // wszystko ok
	            nums.add(3, 5);
	            // wszystko ok, pobieramy wczeœniej dodan¹ liczbê
	            int number3 = nums.get(3);
	            System.out.println(number3);
	            // b³êdy indeks, wygenerowanie wyj¹tku
	            nums.add(20, 20);
	            // b³êdy indeks, gdyby kod dotar³ do tego miejsca
	            //równie¿ wygenerowany zosta³by wyj¹tek
	            int number20 = nums.get(20);
	            System.out.println(number20);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
