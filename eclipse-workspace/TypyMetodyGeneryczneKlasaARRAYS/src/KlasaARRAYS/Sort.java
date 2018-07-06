package KlasaARRAYS;

public class Sort {

	public static void main(String[] args) {
		int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] numbers2 = new int[numbers1.length];
		
	for(int i=numbers1.length-1;i>=0;i--) {
		System.out.print(numbers1[i]+" ");
		}
		
	System.out.println();
		System.out.println("---------------------");
		
		for(int num: numbers1) {
			System.out.print(num + " ");}
		System.out.println();
		
		System.out.println("----------------");
		
		System.arraycopy(numbers1, 4, numbers2, 0, numbers1.length-4);
		
		for(int num: numbers2) {
			System.out.print(num + " ");
		}
		
		
	}

	

}
