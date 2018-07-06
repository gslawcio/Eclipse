package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class GenerowanieImionSort {

	public static void main(String[] args) {
		
	List<String> name = Arrays.asList("Ania","Wojtek","Ola","Inka","Żaneta");
	
	for(String fname:name)
		System.out.println(fname);
	System.out.println("---------------------------");
	Collections.sort(name, String::compareToIgnoreCase);
	
	for(String fname:name)
		System.out.println(fname);
	}

}
