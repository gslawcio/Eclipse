package HospitalApp;
import Hospital.Hospital;
import Doctor.Doctor;
import Nurse.Nurse;
public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		hospital.add(new Doctor("Irek", "Kowalski", 7500, 1500));
		hospital.add(new Nurse("Renata", "Grzelak", 3000, 7));
		hospital.add(new Nurse("Eugenia", "Pi¹tek", 2500,5));
		
		System.out.println("Pracownicy szpitala: ");
		System.out.println(hospital);
	}
}
