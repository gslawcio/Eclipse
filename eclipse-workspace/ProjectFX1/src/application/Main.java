package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// BorderPane root = new BorderPane();

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setResizable(false); // brak zmiany wymiarów okna

			// -------------------wczytywanie pliku- formatki fxml---------------------------------
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("/fxml/StackPaneWindow.fxml"));
			StackPane stackPane = loader.load();
			Scene scene = new Scene(stackPane);

		//	StackNameControler controller = loader.getController();
			// -----------------------------------------------------
			/*
			 * primaryStage.setX(100); //uruchomienie aplikacji w określinym miejscu ekranu
			 * primaryStage.setY(100);
			 * 
			 * // primaryStage.initStyle(StageStyle.UNDECORATED); //bez nieczego
			 * primaryStage.initStyle(StageStyle.DECORATED);
			 * 
			 * primaryStage.setOpacity(0.9); //przezroczystość od 0 do 1 wartość double
			 */
			primaryStage.setScene(scene);
			primaryStage.setTitle("Pierwsze okno"); // opis w lewym górnym rogu
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
