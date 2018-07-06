package EmployeeCompany;

import java.util.Scanner;

public class CompanyApp {
	public final static int ADD_EMPLOYEE = 0;
	public final static int FIND_EMPLOYEE = 1;
	public final static int EXIT = 2;
	
	private Company company;
	
	CompanyApp(){
		company = new Company();
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		CompanyApp companyApp = new CompanyApp();
	
		int userOption;
		do {
			companyApp.printOptions();
			
			System.out.println("Podaj co chcesz zrobić: ");
			userOption = sc.nextInt();
			sc.nextLine();
			
			switch(userOption) {
			case CompanyApp.ADD_EMPLOYEE:
				companyApp.addEmployees(sc);
				break;
				
			case CompanyApp.FIND_EMPLOYEE:
				companyApp.findAndPrintEmployee(sc);
				break;
				
			case CompanyApp.EXIT:
				System.out.println("Goodbay");
				break;
			}	
		}while (userOption != EXIT );
}
	
private void printOptions() {
	System.out.println("0 - dodanie pracownika");
	System.out.println("1 - wyszukiwanie pracownika");
	System.out.println("2 - wyjście z programu");
}

private void addEmployees(Scanner sc) {
	
	Employee employee = new Employee();
	
	System.out.println("Dodanie pracownika");
	System.out.println("Podaj imię: ");
	employee.setfName(sc.nextLine());
	System.out.println("Podaj nazwisko: ");
	employee.setlName(sc.nextLine());
	System.out.println("Podaj wartość pensji: ");
	employee.setSalary(sc.nextDouble());
	
	company.addEmployee(employee);
	
}

private void findAndPrintEmployee(Scanner sc) {
	
	System.out.println("Wyszukiwanie pracownika");
	System.out.println("Podaj imię: ");
	String firstName = sc.nextLine();
	System.out.println("Podaj nazwisko: ");
	String lastName = sc.nextLine();
	
	Employee employee = company.getEmployee(firstName, lastName);
	System.out.println(employee);
}

}