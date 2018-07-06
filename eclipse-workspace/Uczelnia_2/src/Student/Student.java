package Student;

public class Student {

	private String firstName;
	private String lastName;
	private int nrIndeks;
	
	
	public Student() {
		
	}
	public Student(String firstName, String lastName, int nrIndeks) {
		setFirstName(firstName);
		setLastName(lastName);
		setNrIndeks(nrIndeks);
			}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getNrIndeks() {
		return nrIndeks;
	}
	public void printInfo() {
		String info = getFirstName() + " " + getLastName() + " " + getNrIndeks();
		System.out.println(info);
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setNrIndeks(int nrIndeks) {
		this.nrIndeks = nrIndeks;
	}
	
}
