package PersonDatabase;

public class PersonManager {

	public static void main(String[] args) {
	
		PersonDatabase pdb = new PersonDatabase();
		pdb.add(new Person("Ania","Kowalska","81888888999"));
		pdb.add(new Person("Ignacy","Józefowicz","912344445"));
		pdb.add(new Person("Aleks","Komaszewski","83747474747"));
		System.out.println(pdb);
		
		pdb.remove(new Person("Ignacy","Józefowicz","912344445"));
		System.out.println();
		System.out.println(pdb);
	}

}
