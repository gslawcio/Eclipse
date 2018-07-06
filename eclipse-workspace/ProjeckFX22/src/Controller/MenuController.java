package Controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MenuController {
	private MainController mainController;
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	@FXML
	public void openApp() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OpenAppScreen.fxml"));
		Pane pane = null;
		try {
		 pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OpenAppScreenController openAppScreenContloller = loader.getController();
		openAppScreenContloller.setMainController(mainController);
		mainController.setScreen(pane);
	}
	@FXML
	public void openOptions() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OpenOptions.fxml"));
		Pane pane = null;
		try {
			 pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OpenOptionsController openOptionsController = loader.getController();
		openOptionsController.setMainController(mainController);
		mainController.setScreen(pane);
	}
	@FXML
	public void exit() {
		Platform.exit();
	}
}
