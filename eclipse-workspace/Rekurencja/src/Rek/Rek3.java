package Rek;



public class Rek3 {
	public static void main(String[] args) {
		
		Rek3 adder = new Rek3();
		adder.checkNumber(3);
		System.out.println("--------------------");
		int Lsilnia=adder.silnia(4);
		System.out.println(Lsilnia);
		System.out.println("--------------------");
		int number = adder.sum(5);
		System.out.println(number);
		}
	
	public void checkNumber(int n) {
		String check = n%2 == 0? "Parzysta" : "Nieparzysta";
		System.out.println(n + " " + check);
}

		public int silnia(int s) {
			if (s>1) {
				return s * silnia(s - 1);
			}else
				return s;
		}
		
		public int sum(int n) {
			return n>1? n + sum(n-1) : n;
		}
		
}

