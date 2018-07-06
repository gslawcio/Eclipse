package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;


public class Controller {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextArea textArea;

	@FXML
	private Button button1;
	  @FXML
	    private TextArea textArea2;

	@FXML
	void initialize() {
		assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'fx.fxml'.";
		assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'fx.fxml'.";
        assert textArea2 != null : "fx:id=\"textArea2\" was not injected: check your FXML file 'fx.fxml'.";

		button1.setOnAction(
				x -> textArea.setText(textArea.getText().toUpperCase() + "\nTekst zamieniony na duże litery")); // lambda- pobiera napisany txt i zminie litery na małe po kliknięci na przycisk
		// ustawiona akcja po kliknięciu na consoli wyświetla "sout"
		EventHandler<ActionEvent> action = e -> {
			System.out.println("Zmiana wielkości liter");
		};
		button1.addEventHandler(ActionEvent.ACTION, action);	// wywołanie akcji na przycisku
		
		textArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> textArea2			//zamiana liter - pisane od końca
				.setText(new StringBuilder(textArea.getText()).reverse()
						.toString()));
		
		EventHandler<MouseEvent> actionMouse = e ->{
			System.out.println("Kliknięcie???");
		};
		button1.addEventFilter(MouseEvent.MOUSE_ENTERED, actionMouse);
	}
	/*
	 * @Override public void initialize(URL arg0, ResourceBundle arg1) {
	 * button1.setOnAction(x -> textArea.setText(textArea.getText().toLowerCase()));
	 * 
	 * }
	 */

}
