package Strumien;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
		
		System.out.println("Naciśnij klaiwsz ENTER");
		Instant i1 = Instant.now();
		sc.nextLine();
		System.out.println("Aby zatrzymać naciśnij klawisz ENTER");
		Instant i2 = Instant.now();
		sc.nextLine();
		
		
		Duration dur = Duration.between(i1, i2);
		System.out.println("Upłynęło czasu: "+dur.getSeconds());
		}
	}

}
