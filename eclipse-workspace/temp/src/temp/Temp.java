package temp;
import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Podaj ilo�� liczb: ");
		int liczba = sc.nextInt();
	
	
		
		int suma =0;
		
		while (liczba-- >0) {
			System.out.println("Podaj liczb�: ");
			
			suma += sc.nextInt();
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("Suma liczb: "+suma);
}

}