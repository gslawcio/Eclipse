package ZapisObjektuDoPliku;
import java.io.Serializable;

public class PersonOsoba implements Serializable {
	
private static final long serialVersionUID = 92353785935987L;
	
	private String firstName;
	private String lastName;
	
	public PersonOsoba(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
