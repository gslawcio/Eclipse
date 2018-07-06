package Patient;

public class Patient {
		private String firstName;
		private String lastName;
		private int pesel;
		
		public Patient() {
			
		}
		public Patient(String firstName, String lastName, int pesel){
			setFirstName(firstName);
			setLastName(lastName);
			setPesel(pesel);
		}

		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}

		public int getPesel() {
			return pesel;
		}

		public void printInfo() {
			String info = getFirstName() + " " + getLastName() + " " + getPesel() ;
			System.out.println(info);
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setPesel(int pesel) {
			this.pesel = pesel;
		}
}
