package HashMap;

import java.util.HashMap;
import java.util.Map;

public class NotebookApp {

	public static void main(String[] args) {
		Map<String, Notebook> notebooks = new HashMap<>();
		notebooks.put("B590", new Notebook("Lenovo","B590"));
		notebooks.put("SG760", new Notebook("Asus","SG760"));
		notebooks.put("DS223", new Notebook("Hp","DS223"));
		
		for(String key:notebooks.keySet()) {
			System.out.println(key);
		}
		
		for(String key:notebooks.keySet()) {
			System.out.println(notebooks.get(key));
		}
		System.out.println("Ilość laptopów : "+notebooks.size());
		System.out.println("---------------------");
		
		String key= "SG760";
		System.out.println("Znaleziono laptop o nazwie "+key);
		System.out.println(notebooks.get(key));
		System.out.println("---------------------");
		
		notebooks.remove("DS223");
		System.out.println("Ilość laptopów : "+notebooks.size());
		
		for(String keys:notebooks.keySet()) {
			System.out.println(notebooks.get(keys));
		}
	}

}
