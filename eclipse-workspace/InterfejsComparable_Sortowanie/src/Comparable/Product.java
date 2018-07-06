package Comparable;

public class Product implements Comparable<Product> { //metoda compareTo() przyjmuje jako argument typu Object. Interfejs Comparable zosta³ zaktualizowany
	//i teraz wystêpuje jako typ generyczny, podajemy informacjê ¿e chcemy porównywaæ obiekty typu Product z innymi obiektami tego typu

	private String category;
	private String name;
	private String producer;
	public Product(String producer, String name, String category) {
		setProducer(producer);
		setName(name);
		setCategory(category);
	}
	@Override
	public int compareTo(Product p) {
		int categoryCompare = category.compareTo(p.getCategory());
		if (categoryCompare != 0) {
			return categoryCompare;
		}
		int producerComapare = producer.compareTo(p.getProducer());
		if (producerComapare != 0) {
			return producerComapare;
		}
			
		return name.compareTo(p.getName());
	}
	public String getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public String getProducer() {
		return producer;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	@Override
	public String toString() {
		return "Product [category=" + category + "producer=" + producer + ", name=" + name + ", ]";
	}
	
}
