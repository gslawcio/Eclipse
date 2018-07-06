package Pizza;

public enum Pizza {
	CAPRICIOSA(true, true, true, false),
	MARGHERITA(true, true, false, false),
	PROSCIUTTO(true, true, false, true);
	
	private boolean cheese;
	private boolean ham;
	private boolean mushrooms;
	private boolean tomatoSauce;
	
	Pizza(boolean ts, boolean ch, boolean m, boolean h) {
		tomatoSauce =ts;
		cheese = ch;
		mushrooms = m;
		ham = h;
	}
	
	public boolean getCheese() {
		return cheese;
	}
	
	public boolean getHam() {
		return ham;
	}
	
	public boolean getMushrooms() {
		return mushrooms;
	}
	
	public boolean getTomatoSauce() {
		return tomatoSauce;
	}
	
	@Override
	public String toString() {
		//przypisanie nazwy pizzy
		String result = this.name() + "(";
		//informacja o sk³adnikach
		if(tomatoSauce) {
			result = result + "sos pomidorowy";
		}
		if(cheese) {
			result = result + ", ser";
		}
		if(mushrooms) {
			result = result + ", pieczarki";
		}
		if(ham) {
			result = result + ", szynka";
		}
		result = result + ")";
		
		return result;
	}
}
