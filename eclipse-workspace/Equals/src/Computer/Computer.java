package Computer;

public class Computer {
	private int model;
	private String producer;
	public Computer(String producer, int model) {
		this.producer = producer;
		this.model = model;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Computer))
			return false;
		Computer comp = (Computer) obj;
		if(producer != null)
			if(producer.equals(comp.getProducer()) && comp.getModel() == this.model)
				return true;
		return false;
	}
	public int getModel() {
		return model;
	}
	public String getProducer() {
		return producer;
	}
	
	public void setModel(int model) {
		this.model = model;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	@Override
	public String toString() {
		return producer + " " + model;
	}
}
