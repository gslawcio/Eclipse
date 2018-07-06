package Container;

public class Container<T> {
	private T[] array;

	public T get(int index) {
		return array[index];
	}

	public T[] getArray() {
		return array;
	}

	public void printObjects() {
		for(T o: array) {
			System.out.println(o);
		}
	}
	
	public void setArray(T[] array) {
		this.array = array;
	}

   
}
