package Controller;

import java.io.IOException;

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
		} catch (IOException e) {
			e.printStackTrace();
		}
		MenuController menuController = loader.getController(); // wyciągamy kontroler  z MenuController
		menuController.setMainController(this);					//przekazujemy do niego this - instancję tej klasy
		setScreen(pane);
	}
	public void setScreen(Pane pane) {
		mainStackPane.getChildren().clear(); 				// ustawiamy pane = clear . Czyścimy
		mainStackPane.getChildren().add(pane);
	}
}
