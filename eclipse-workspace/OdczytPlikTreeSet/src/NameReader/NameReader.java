package NameReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class NameReader {
	public static void main(String[] args) throws FileNotFoundException {
		 
	        BufferedReader reader = new BufferedReader(new FileReader("namespl.txt"));
	        
	        TreeSet<String> names= new TreeSet<>(new Comparator <String>() {
	        	
	        	public int compare(String o1, String o2) {
	        		return o2.compareTo(o1);
	        	}
	        });
	    
	     try {
	            String nextLine = null;
	              while ((nextLine = reader.readLine()) != null) {
	                names.add(nextLine);
	            }
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if(reader != null)
	                    reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		for(String nam: names) {
			System.out.println(nam);
		}
		System.out.println("Ilość imion w zbiorze: " + names.size());
		System.out.println("Pierwsze imię: " + names.first());
		System.out.println("Ostatnie imię w zbiorze: " + names.last());
	}
}
