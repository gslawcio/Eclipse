package Para;

public class Pair <V,T> {

	private T t;
	private V v;
	
	public Pair(T t,V v) {
		setT(t);
		setV(v);
	}
	public T getT() {
		return t;
	}
	
	public V getV() {
		return v;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	public void setV(V v) {
		this.v = v;
	}
}
