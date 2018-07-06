package pl.javastart.youtufy.main;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
public class Main extends Application {

	
	
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {

		Parent parent = FXMLLoader.load(getClass().getResource("/pl/javastart/youtufy/view/MainPane.fxml"));
		Scene scene = new Scene(parent);
		arg0.setScene(scene);
		arg0.setTitle("YouTufy v0.1");
		setUserAgentStylesheet(STYLESHEET_CASPIAN);
		arg0.show();
	}

}
