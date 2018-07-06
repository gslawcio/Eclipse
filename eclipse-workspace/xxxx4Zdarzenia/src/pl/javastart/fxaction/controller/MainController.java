package pl.javastart.fxaction.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController implements Initializable {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextArea mainTextArea;

	@FXML
	private Button lowerCaseButton;

	@FXML
	void initialize() {
		assert mainTextArea != null : "fx:id=\"mainTextArea\" was not injected: check your FXML file 'fxmlzdarzenia.fxml'.";
		assert lowerCaseButton != null : "fx:id=\"lowerCaseButton\" was not injected: check your FXML file 'fxmlzdarzenia.fxml'.";

	}

	@Override			// zaminia duże litery na małe
	public void initialize(URL arg0, ResourceBundle arg1) {
		lowerCaseButton.setOnAction(x -> mainTextArea.setText(mainTextArea.getText().toLowerCase()));
		
		
		/*
		lowerCaseButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Wygenerowano zdarzenie " + arg0.getEventType());
				String text = mainTextArea.getText();
				mainTextArea.setText(text.toLowerCase());

			}
		});
		*/
	}
}
