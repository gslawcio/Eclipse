package PointControler;


import Punkt.Punkt;
public class PointControler {
	
	
	public void addX(Punkt p)
	{
		p.setX(p.getX()+1);
	}
	
	public void addY(Punkt p)
	{
		p.setY(p.getY()+1);
	}
	
	public void odejmowanieX(Punkt p)
	{
		p.setX(p.getX()-3);
	}
	public void odejmowanieY(Punkt p)
	{
		p.setY(p.getY()-3);
	}
	
	
}
