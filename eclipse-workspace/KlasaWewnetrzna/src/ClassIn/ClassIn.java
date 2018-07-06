package ClassIn;

public class ClassIn {
	public class Nowa{
		private int c;
	 
		public Nowa(int c) {
			this.c=c;
		}
	 	 
	public void print() {
		System.out.println("liczba a= "+aPrivate);
		System.out.println("liczba a= "+bPublic);
		int a = ClassIn.aStaticPrivate;
		int b = ClassIn.bStaticPublic;
		System.out.println("Publiczna i prywatna klasy ClassIn: "+a+"    "+b);
		System.out.println(c);
		System.out.println();
		
	}
	
}
	private static int aStaticPrivate = 333;
	
	public static int bStaticPublic = 444;
	private int aPrivate= 22;
	
	
		public int bPublic = 33;
	
		
		public void zmiana() {
			Nowa nowa = new Nowa(3);
			nowa.c = 12345;
			nowa.print();
		}
		
		
}
