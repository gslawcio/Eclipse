package Company;

import java.io.Serializable;

public class Osoba implements Serializable{
	private static final long serialVersionUID=1L;
	private String fName;
	private String lName;
	
	public Osoba() {}
	public Osoba(String fName,String lName) {
		setfName(fName);
		setlName(lName);
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String toString() {
		return getfName() + " " + getlName();
	}
}
