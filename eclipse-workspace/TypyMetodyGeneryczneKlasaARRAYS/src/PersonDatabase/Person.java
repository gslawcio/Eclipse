package PersonDatabase;

public class Person {

	private String fName;
	private String lName;
	private String PESEL;
	public Person(String fName,String lName,String PESEL) {
		setfName(fName);
		setlName(lName);
		setPESEL(PESEL);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (PESEL == null) {
			if (other.PESEL != null)
				return false;
		} else if (!PESEL.equals(other.PESEL))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getPESEL() {
		return PESEL;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PESEL == null) ? 0 : PESEL.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		return result;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", PESEL=" + PESEL + "]";
	}
	
}
