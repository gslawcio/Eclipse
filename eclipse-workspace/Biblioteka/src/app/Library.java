package app;
import data.Book;
import Utils.DataReader;

public class Library {
public static void main(String[] args) {
        
        final String appName = "Biblioteka v0.6";

        Book[] books = new Book[100];
        DataReader dateReader = new DataReader();
        
		Book books1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg",
				"9788373271890");
		Book books2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
				352, "Helion", "9788324620845");
		Book books3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
				"Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media",
				"9780071591065");

		System.out.println(appName);
		System.out.println("Ksi¹¿ki dostêpne w bibliotece:");
		books1.printInfo();
		books2.printInfo();
		books3.printInfo();
		
		System.out.println();
		System.out.println("WprowadŸ now¹ ksi¹¿kê:");
		books[4] = dateReader.readAndCreateBook();
		
		dateReader.close();
		
		books[4].printInfo();
		
		System.out.println("System mo¿e przechowywaæ do " + books.length + " ksi¹¿ek");
		
		
		
    }
}
