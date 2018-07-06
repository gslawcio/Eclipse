package temp4;

public class Student {
	String firstName;
	String lastName;
	
	public Student(String fn, String ln) {
		firstName = fn;
		lastName = ln;
}
	
	@Override
	public boolean equals(Object obj) {
		// sprawdzenie r�wno�ci fizycznej za pomoc� ==
        if (this == obj)
            return true;
        // sprawdzamy, czy nie null
        if (obj == null)
            return false;
 
        // sprawdzamy, czy przekazany argument jest typu Student
        if (!(obj instanceof Student))
            return false;
        //rzutowanie na odpowiedni typ
        Student s = (Student) obj;
         
        // sprawdzenie kolejnych p�l klasy, uwa�aj�c na warto�ci null
        if(this.firstName == s.firstName && this.lastName == s.lastName)
            return true;
        if(this.firstName != null) {
            if(!this.firstName.equals(s.firstName))
                return false;
        } else if(this.firstName == null && s.firstName != null)
            return false;
        if (this.lastName != null) {
            if(!this.lastName.equals(s.lastName))
                return false;
        } else if(this.lastName == null && s.lastName != null)
            return false;
        //je�li dojdziemy do tego miejsca to obiekty s� r�wne
        return true;
    }
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}