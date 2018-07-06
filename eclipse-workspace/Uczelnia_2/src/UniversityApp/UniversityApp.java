package UniversityApp;
import java.util.Scanner;
import University.University;
import Student.Student;

public class UniversityApp {
	
	public static final int ADD_STUDENT = 1;
	public static final int EXIT = 0;
	public static final int PRINT_STUDENT = 2;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int option = 7;
		
		University student = new University();

		while (option != EXIT) {
			System.out.println("Dostêpne opcje: ");
			System.out.println("0 - wyjœcie z programu");
			System.out.println("1 - dodanie pacjenta");
			System.out.println("2 - wyœwietlenie listy pacjentów");

			System.out.println("Wybierz opcjê: ");
			option = input.nextInt();
			input.nextLine();

			switch (option) {
			case ADD_STUDENT:
				Student studenty = new Student();
				System.out.println("Imiê: ");
				studenty.setFirstName(input.nextLine());
				System.out.println("Nazwisko: ");
				studenty.setLastName(input.nextLine());
				System.out.println("PESEL: ");
				studenty.setNrIndeks(input.nextInt());
				student.addStudent(studenty);
				break;
			case PRINT_STUDENT:
				student.printStudent();
				break;
			case EXIT:
				System.out.println("Zamykam program!");
				break;
			default:
				System.out.println("Nie znaleziono takiej opcji");
			}
		}
		
		input.close();
		
	}
	}

