package Car;

public class Car {
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public class Engine {
		
		private static final int FUEL_CONSUMPTION= 10;
		private String engineType;
		
		public Engine(String type) {
			engineType = type;
		}
		
		public void consumeFuel() {
			fuel = fuel - FUEL_CONSUMPTION;
		}
	}
	private Engine engine;
	
	private int fuel;
	
	public Car() {
		engine = new Engine("Ferrari");
		System.out.println("Utworzono samochód z silnikiem " + engine.engineType);
	}
	
	public void go()  {
		while(fuel > 0) {
			engine.consumeFuel();
			System.out.println("Pozosta³o " + fuel + " litrów paliwa");
		//	Thread.sleep(1000);
		}
		System.out.println("Brak paliwa");
	}
public void refuel(int liters) {
		fuel = fuel + liters;
	}
}
