package temp4;
import temp4.Student;
public class School {
 public static void main(String[] args) {
	

	Student student1 = new Student("Jan", "Kowalski");
	Student student2 = new Student("Jan", "Kowalski");
	System.out.println("student1 == student2:");
	
	System.out.println(student1 == student2);
	System.out.println("student1.equals(student2):");
	System.out.println(student1.equals(student2));
	
	System.out.println("Lista studentów: ");
	System.out.println(student1);
	
	//Student student1 = new Student("Jan", "Kowalski");
	String student1Desc = student1.toString();
	System.out.println(student1Desc);
}
}