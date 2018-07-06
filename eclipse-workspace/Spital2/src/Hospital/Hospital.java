package Hospital;
import Person.Person;
public class Hospital {

	public static final int MAX_EMPLOYEES=3;
	
	private Person[] employees;
	private int employeesNumber;
	
	public Hospital() {
		setEmployees(new Person[MAX_EMPLOYEES]);
		setEmployeesNumber(0);
	}
	public void add(Person person) {
		if(getEmployeesNumber() < MAX_EMPLOYEES) {
			getEmployees()[getEmployeesNumber()] = person;
			setEmployeesNumber(getEmployeesNumber() + 1);
		}
	}
	public Person[] getEmployees() {
		return employees;
	}
	public int getEmployeesNumber() {
		return employeesNumber;
	}
	
	public void setEmployees(Person[] employees) {
		this.employees = employees;
	}
	public void setEmployeesNumber(int eployesNumber) {
		this.employeesNumber = eployesNumber;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i=0; i<employeesNumber; i++) {
			result = result + employees[i] + "\n";
		}
		return result;
	}
}
