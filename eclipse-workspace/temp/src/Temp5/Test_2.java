 	package Temp5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Test_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[2];
		boolean error = true;
		
		do {
			try {
				System.out.println("Podaj 1 liczbê: ");
				numbers[0] = sc.nextInt();
				sc.nextLine();
				System.out.println("Podaj 2 liczbê: ");
				numbers[1] = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Któr¹ wartoœæ wyœwietliæ (1 lub 2)? ");
				System.out.println(numbers[sc.nextInt() - 1]);
				error = false;
			} catch(InputMismatchException ex) {
				System.out.println("Nie poda³eœ liczby ca³kowitej, spróbuj jeszcze raz: ");
				sc.nextLine();
			} catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Mia³o byæ 1 lub 2, zacznijmy od nowa: ");
				
			}
			finally {
				sc.nextLine();
			}
		}while(error);
		sc.close();
	}
}

