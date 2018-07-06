package snippet;

public class Snippet {
	 String fileName = "tekstFile.txt";
		        File file = new File(fileName);			//tworzymy obiekt file typu File i wrzucamy do niego plik fileName
		        Scanner scan = new Scanner(file);		//scanner przyjmuje obiekt File
		        
		        int lines = 0;
		        while(scan.hasNextLine()) {			//sczytuje ile jest lini w pliku
		            String name = scan.nextLine();	//do zmniennej name zapisuje kolejne linie 
		            System.out.println(name);
		            lines++;
		        }
		        System.out.println("Iloœæ wierszy w pliku: " + lines);
		        scan.close();
}

