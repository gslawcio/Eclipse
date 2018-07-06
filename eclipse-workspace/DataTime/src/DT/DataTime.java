package DT;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

public class DataTime {

	public static void main(String[] args) throws InterruptedException {

		Instant actualTime = Instant.now();
		System.out.println(actualTime);
	System.out.println("-------------------------------------");
	
	Instant i1 = Instant.now();
	for(int i=0;i<100;i++) {
		System.out.println("Miernik czasu");
	}
	System.out.println("-------------------------------------");
	Instant i2 = Instant.now();
	Duration duration = Duration.between(i1, i2);
	System.out.println("Upłynęło : "+duration);
	System.out.println("-------------------------------------");
	
	LocalTime lt1 = LocalTime.now();
	LocalTime lt2 = LocalTime.of(12, 0);
	System.out.println(lt1);
	System.out.println(lt2);
	Duration dur = Duration.between(lt1, lt2);
	System.out.println(dur);
		
	System.out.println("-------------------------------------");
	LocalTime now = LocalTime.now();
	
	for(int i=0; i<10; i++) {
		System.out.println(now);
		now = now.plusSeconds(1);		//Wyświetla co sekundę
		Thread.sleep(1000);
	}
	System.out.println("-------------------------------------");
	LocalDate nowDate = LocalDate.now();
	LocalDate firstJan2014 = LocalDate.of(2014, 1, 1);
	
	boolean check = nowDate.isAfter(firstJan2014);
	System.out.println("Czy " + now + " jest po " + firstJan2014 + "?");
	System.out.println(check);
	
	
	}

}
