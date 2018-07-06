package University;

import Student.Student;
public class University {
	
	private int regStudent=0;
	private Student[] students;

	public University() {
		students = new Student[100];
		regStudent = 0;
	}

	public void addStudent(Student stu) {
		    students[regStudent] = stu;
			regStudent++;
			}

	public void printStudent() {
		
		for(int i=0; i<regStudent; i++) {
			System.out.println("Student: ");
			System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " "
					+ students[i].getNrIndeks());
		}	
		System.out.println("iloœæ studentów: "+regStudent);
	}
	
}
