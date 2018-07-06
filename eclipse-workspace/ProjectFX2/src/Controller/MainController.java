package Controller;

import Controller.MenuController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private StackPane mainStackPane;

    @FXML
    public void initialize() {
    	loadMenuScreen();
    }

	public void loadMenuScreen() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
    	Pane pane = null;
    	try {
			pane = loader.load();		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	MenuController menuController = loader.getController(); //odwołanie się przez referencję do MenuController
    	menuController.setMainController(this);					//  
    	SetScreen(pane);	// dodajemy do przycisku nowe okno czyli pane
	}

	public boolean SetScreen(Pane pane) {
		mainStackPane.getChildren().clear();		// czyszczenie przed pobraniem kolejnej formatki (pane)
		return mainStackPane.getChildren().add(pane);
	}
}
