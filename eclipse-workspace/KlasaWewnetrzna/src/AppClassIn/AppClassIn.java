package AppClassIn;
import ClassIn.ClassIn;
public class AppClassIn {
		public static void main(String[] args) {
	
			ClassIn classIn = new ClassIn();
			ClassIn.Nowa nowa =classIn.new Nowa(3);
			
			nowa.print();
			classIn.zmiana();
			System.out.println();
			
			ClassIn classIn2 = new ClassIn();
			ClassIn.Nowa nowa2= classIn2.new Nowa(2);
			classIn.bPublic=999999;
			nowa2.print();
			System.out.println();
		
			}
}
