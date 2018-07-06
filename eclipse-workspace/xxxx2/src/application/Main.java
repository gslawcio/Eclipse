package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/fmxl/fmxl2.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Page");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
