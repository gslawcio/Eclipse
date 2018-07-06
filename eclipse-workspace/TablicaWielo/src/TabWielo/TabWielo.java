package TabWielo;

public class TabWielo {
	public static void main(String[] args) {
		double tab[][] = new double[3][3];
		tab[0][0]=1;
		tab[0][1]=1.5;
		tab[0][2]=2;
		tab[1][0]=1.5;
		tab[1][1]=2;
		tab[1][2]=2.5;
		tab[2][0]=2;
		tab[2][1]=2.5;
		tab[2][2]=3;
		
		
		
		double suma = (tab[0][0]*tab[1][1]*tab[2][2])+(tab[0][2]*tab[1][1]*tab[0][2]);
		System.out.println(suma);
		System.out.println();
		
		suma = (tab[1][0]+tab[1][1]+tab[1][2])*(tab[0][1]+tab[1][1]+tab[2][1]);
		System.out.println(suma);
		System.out.println();
		
		suma = tab[0][0]+tab[0][1]+tab[0][2]+tab[1][0]+tab[2][0]+ tab[2][1] + tab[2][2];
		System.out.println(suma);
		System.out.println();
	}
}
