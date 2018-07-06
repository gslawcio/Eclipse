package Nurse;
import Person.Person;
public class Nurse extends Person{

	private double overTime;

	public Nurse(String firstName, String lastName, double wyplata,double overTime) {
		super(firstName,lastName,wyplata);
		setOverTime(overTime);
		
	}

	public double getOverTime() {
		return overTime;
	}
	
	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}
	@Override
	public String toString() {
		return super.toString()+"  Nadgodziny: "+overTime;
	}
}
