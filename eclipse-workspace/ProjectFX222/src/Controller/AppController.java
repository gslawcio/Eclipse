package Controller;

import javafx.fxml.FXML;

public class AppController {

	@FXML
	private MainController mainController;		// tworzymy pole MainController i ustawiamy metodę set
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
	@FXML 
	public void openMenu() {
		mainController.loadMenuScreen();
		
	}
}
