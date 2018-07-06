package TestNumbers;
import Numbers.Numbers;
public class TestNumbers {
	  public static void main(String[] args) {
		  Numbers nums = new Numbers();
	        try {
	            // wszystko ok
	            nums.add(3, 5);
	            // wszystko ok, pobieramy wcze�niej dodan� liczb�
	            int number3 = nums.get(3);
	            System.out.println(number3);
	            // b��dy indeks, wygenerowanie wyj�tku
	            nums.add(20, 20);
	            // b��dy indeks, gdyby kod dotar� do tego miejsca
	            //r�wnie� wygenerowany zosta�by wyj�tek
	            int number20 = nums.get(20);
	            System.out.println(number20);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
