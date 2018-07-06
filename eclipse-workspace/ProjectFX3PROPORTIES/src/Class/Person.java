package Class;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	// Z PROPERTIES
	
	private StringProperty propertyTextField = new SimpleStringProperty(this, "nameProperty", "John Snow");

	public StringProperty getPropertyTextField() {
		return propertyTextField;
	}

	public void setPropertyTextFielad(StringProperty propertyTextField) {
		this.propertyTextField = propertyTextField;
	}
	
	
	/* BEZ PROPERTIES
	private String name = "John";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/
}
