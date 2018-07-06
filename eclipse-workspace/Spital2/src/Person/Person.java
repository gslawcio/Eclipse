package Person;

public class Person {

	private String firstName;
	private String lastName;
	private double wyplata;
	
	public Person(String firstName, String lastName, double wyplata) {
		setFirstName(firstName);
		setLastName(lastName);
		setWyplata(wyplata);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLast1Name() {
		return lastName;
	}
	public double getWyplata() {
		return wyplata;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setWyplata(double wyplata) {
		this.wyplata = wyplata;
	}
	@Override
	public String toString() {
		return "Imiê: "+firstName+"  Nazwisko: "+lastName+ "  Wyp³ata: "+wyplata;
	}
	
}
