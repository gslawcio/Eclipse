package Doctor;
import Person.Person;


public class Doctor extends Person {

	private double bonus;

	public Doctor(String firstName, String lastName, double wyplata, double bonus) {
		super(firstName,lastName,wyplata);
		setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"  Premia: "+bonus;
	}
}
