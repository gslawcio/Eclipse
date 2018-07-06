package Net;

import java.util.Scanner;

public class NetZad1 {
	public static void main(String[] args) {
		
		NetZad1 zad = new NetZad1();
		Scanner scanner= new Scanner(System.in);
		
		int l;
		
		System.out.println("podaj liczbê: ");
		l=scanner.nextInt();
		scanner.close();
		
		int z=zad.w(l);
		System.out.println(z);
	}
	
private int w(int l1){
	return l1+1;
}
}