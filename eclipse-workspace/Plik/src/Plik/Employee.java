package Plik;
import Plik.Person;
public class Employee extends Person{
	
	private double salary;
	
	

	public Employee() {}

	public Employee(String firstName,String lastName,double slary){
		super();
		setSalary(salary);	
		
	}
	public double getSalary() {
		return salary;
	};
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return super.toString()+" wyp³ata: "+getSalary();
	}
}
