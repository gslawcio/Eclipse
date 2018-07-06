package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControlPaneController implements Initializable{
	@FXML
	private Button upperCaseButton;
	public Button getUpperCaseButton() {
		return upperCaseButton;
	}


	public void setUpperCaseButton(Button upperCaseButton) {
		this.upperCaseButton = upperCaseButton;
	}


	public Button getLowerCaseButton() {
		return lowerCaseButton;
	}


	public void setLowerCaseButton(Button lowerCaseButton) {
		this.lowerCaseButton = lowerCaseButton;
	}


	@FXML
	private Button lowerCaseButton;
	@FXML
	private Button clear;

	public Button getClear() {
		return clear;
	}


	public void setClear(Button clear) {
		this.clear = clear;
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Stworzono ControlPaneController");
		
	}
}
