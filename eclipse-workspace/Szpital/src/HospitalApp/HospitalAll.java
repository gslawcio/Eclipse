package HospitalApp;

import Hospital.Hospital;
import Patient.Patient;
import java.util.Scanner;
public class HospitalAll {
	public static final int addPatient = 1;
	public static final int exit = 0;
	public static final int printPatient = 2;
	
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			int option = 7;
		
			Hospital hospital = new Hospital();

			while (option != exit) {
				System.out.println("Dostêpne opcje: ");
				System.out.println("0 - wyjœcie z programu");
				System.out.println("1 - dodanie pacjenta");
				System.out.println("2 - wyœwietlenie listy pacjentów");

				System.out.println("Wybierz opcjê: ");
				option = input.nextInt();
				input.nextLine();

				switch (option) {
				case addPatient:
					Patient patient = new Patient();
					System.out.println("Imiê: ");
					patient.setFirstName(input.nextLine());
					System.out.println("Nazwisko: ");
					patient.setLastName(input.nextLine());
					System.out.println("PESEL: ");
					patient.setPesel(input.nextInt());
					hospital.addPatient(patient);
					break;
				case printPatient:
					hospital.printPatients();
					break;
				case exit:
					System.out.println("Zamykam program!");
					break;
				default:
					System.out.println("Nie znaleziono takiej opcji");
				}
			}
			
			input.close();
		}
}