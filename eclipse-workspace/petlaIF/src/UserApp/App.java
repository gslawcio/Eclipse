package UserApp;

import User.User;


public class App {

	  public static void main(String[] args) {
	User user = new User("Jan", "Kowalski");
	
	 System.out.println("Wybierz opcjê:");
     System.out.println("0 - wyjœcie z programu");
     System.out.println("1 - wyœwietl informacje o u¿ytkowniku");
     System.out.println("2 - modyfikuj dane u¿ytkownika");
      
     int option = 1;
     
     System.out.println();
     
     if(option == 0) {
         System.out.println("Bye bye!");
     } else if(option == 1) {
         System.out.println("U¿ytkownik: "+user.getImie()+" "+user.getNazwisko());
     } else if(option == 2) {
         user.setImie("Marian");
         user.setNazwisko("Powolny");
         System.out.println("Zmieniono dane u¿ytkownika na: "+user.getImie()+" "+user.getNazwisko());
     }
     else
    System.out.println("Z³e dane");
}
}