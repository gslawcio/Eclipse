package pl.javastart.mp3player.main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		final String appName = "Mp3Player v0.4";
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/pl/javastart/mp3player/view/MainPane.fxml"));
			BorderPane borderPane = loader.load();
			Scene scene = new Scene(borderPane);
			primaryStage.setTitle(appName);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}