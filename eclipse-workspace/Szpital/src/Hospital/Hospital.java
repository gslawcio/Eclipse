package Hospital;

import Patient.Patient;

public class Hospital {

	public static final int maxZarejest = 3;
	private Patient[] patients;
	private int regPatiens;

	public Hospital() {
		patients = new Patient[maxZarejest];
		regPatiens = 0;
	}

	public void addPatient(Patient patient) {
		if (regPatiens < maxZarejest) {
			patients[regPatiens] = patient;
			regPatiens++;
		} else {
			System.out.println("Zapisano maxymaln¹ liczbê pacjentów, zapraszamy jutro!");
		}
	}

	public void printPatients() {
		
		for(int i=0; i<regPatiens; i++) {
			System.out.println("Pacjent: ");
			System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName() + " "
					+ patients[i].getPesel());
		}
	}
}
