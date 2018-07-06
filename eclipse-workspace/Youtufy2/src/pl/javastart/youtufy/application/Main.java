package pl.javastart.youtufy.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		final String appName = "Youtufy v0.1";
		
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/pl/javastart/youtufy/view/MainPane.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle(appName);
		setUserAgentStylesheet(STYLESHEET_CASPIAN);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
