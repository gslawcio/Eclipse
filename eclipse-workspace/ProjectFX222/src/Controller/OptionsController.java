package Controller;

import javafx.fxml.FXML;

public class OptionsController {
	@FXML
	private MainController mainController;	

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	@FXML
	public void openMenu() {
		mainController.loadMenuScreen();
	}
}
