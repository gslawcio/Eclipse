package PointAplication;

import PointControler.PointControler;
import Punkt.Punkt;
public class PointAplication {
	 public static void main(String[] args) {
	
	
	Punkt p1 = new Punkt(10, 20);
	PointControler pc = new PointControler();
	
//	System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
//	pc.addX(p1);
//	System.out.println("Punkt addX: (" + p1.getX()+";"+p1.getY()+")");
//	pc.addY(p1);
//	System.out.println("Punkt addY: (" + p1.getX()+";"+p1.getY()+")");
//	pc.odejmowanieX(p1);
//	System.out.println("Punkt odejmowanieX: (" + p1.getX()+";"+p1.getY()+")");
//	pc.odejmowanieY(p1);
//	System.out.println("Punkt odejmowanieY: (" + p1.getX()+";"+p1.getY()+")");
	
	
	final int ADD_X = 1;
	final int ADD_Y = 2;
	final int MINUS_X = 3;
	final int MINUS_Y = 4;
	
	int metoda = 4;
	
	switch(metoda) {
	case ADD_X:
		pc.addX(p1);
		break;
	case ADD_Y:
		pc.addY(p1);
		break;
	case MINUS_X:
		pc.odejmowanieX(p1);
		break;
	case MINUS_Y:
		pc.odejmowanieY(p1);
		break;
	default:
	System.out.println("Punkt po zmianie: (" + p1.getX()+";"+p1.getY()+")");
	}
	System.out.println("Punkt po zmianie: (" + p1.getX()+";"+p1.getY()+")");
}}
