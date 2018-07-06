package EmployeeCompany;

import java.util.HashMap;

public class Company {

	private HashMap<String, Employee> employees;
	
	public Company() {
		employees= new HashMap<>();
	}
	public boolean addEmployee(Employee employee) {
		String key = employee.getfName()+ " "+employee.getlName();
		if(employees.get(key) != null) {
			return false;
		}else {
			employees.put(key, employee);
			return true;
		}
	}
	
	public Employee getEmployee(String fName, String lName) {
		String key = fName+ " "+lName;
		return employees.get(key);	
	}
	
}
