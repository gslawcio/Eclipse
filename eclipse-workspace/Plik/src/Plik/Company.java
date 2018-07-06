package Plik;
import Plik.Employee;
public class Company {

	public static final int FIRMA = 2;
	private Employee[] firmy;
	
	public Company() {
		firmy=new Employee[FIRMA];
	}
	public void add(Employee emp,int index) {
		firmy[index]=emp;
	}
	public Employee[] getFirmy() {
		return firmy;
	}
	public void setFirmy(Employee[] firmy) {
		this.firmy = firmy;
	}
}