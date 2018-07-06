package University;

import Student.Student;
public class University {
			public static void main(String[] args) {
	
		
		Student Students1= new Student("Adam","Kowalski",122222);
		Student Students2= new Student("Iwona","Zdyb",123435452);
		Students1.printInfo();
		Students2.printInfo();

		System.out.println("Liczba studentów: "+Student.L_STUDENT);
	
		
		
		
	}
}
