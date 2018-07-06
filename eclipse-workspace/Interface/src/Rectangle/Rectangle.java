package Rectangle;

import Interface.Shape;

public class Rectangle implements Shape {
	
	private double a;
	private double b;

	public Rectangle() {
		
	}
	
	public Rectangle(double a, double b){
		this.a= a;
		this.b=b;
	};

	@Override
	public double calculateArea() {
		
		return a*b;
	}

	@Override
	public double calculatePerimeter() {
		
		return 2*a+2*b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Prostok¹t    ");
		sb.append("Bok a = "+getA()+ "    bok b = "+getB());
		sb.append("   Pole = "+calculateArea());
		sb.append("   Obwód = "+calculatePerimeter());
		return sb.toString();
	}
}
