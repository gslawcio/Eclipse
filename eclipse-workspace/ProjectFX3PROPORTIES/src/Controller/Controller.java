package Controller;

import Class.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
																// PROPERTYS AKTUALIZUJA NA BIEŻACO
	@FXML
	private TextField textField;
	@FXML
	private Label labelName;
	
	private Person person = new Person();	// referencja do klasy person
	
	@FXML
	 public void initialize() {								// bindBidirectional aukualizuje dane z textField i z person z getPropertyTextField
		textField.textProperty().bindBidirectional(person.getPropertyTextField());	//bindowanie. Bindujemy pole tekstowe textField z klasą person. Odrazu pojawia się wartośc początkowa z klasy person
		labelName.textProperty().bind(person.getPropertyTextField());				// pola label z funkcją klasy person getPropertyTextField. Na bieżąco akualizuje pole label z polem propertyTextField
															// bind akualizuje dane tylko z jednej strony z getPropertyTextField. label nic nie może zmienić
		
		/*	BEZ PROPERTIES
		textField.setText(person.getName());		//ustawiamy Text Field
		labelName.setText(person.getName());		//ustawiamy label
		*/
	}	
	@FXML
	public void write() {
		
		
		/*BEZ PROPERTIES
		labelName.setText(textField.getText()); // w polu labelName ustawiamy imie z pola textField
		person.setName(textField.getText());	//aktualizujemy person
		*/
	}
}
 