package Rek;

public class Rek1 {

	public static void main(String[] args) {

		Rek1 adder = new Rek1();
		
		int number = adder.sum(3);
		System.out.println(number);
	}
	
	public int sum(int n) {
		if(n>1) {
			System.out.println(n + "+" + "sum(" + (n-1) + ")");
			return n + sum(n-1);
		} else {
			return n;
		}
	
	}

}
