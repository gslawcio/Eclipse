package Controller;

import javafx.fxml.FXML;

public class OpenOptionsController {

	private MainController mainController;

	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}


	@FXML
	public void backMenu() {
		mainController.loadMenuScreen();
	}
}
