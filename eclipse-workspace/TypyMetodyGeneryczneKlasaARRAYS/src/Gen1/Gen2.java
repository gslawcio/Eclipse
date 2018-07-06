package Gen1;

public class Gen2 {

	public static void main(String[] args) {
		
		Gen2 gm = new Gen2();
		gm.print5Times(2);
		gm.print5Times("Krzysio");
	}
	
	public <T> void print5Times(T arg) {
		for(int i=0; i<5; i++)
			System.out.println(arg);
	}
}