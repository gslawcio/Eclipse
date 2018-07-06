package application;
	

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException{
	//	try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/fxml3/fxml3.fxml"));
		StackPane stackPane = loader.load();								// całość okienka na StackPane
		Scene scene = new Scene(stackPane);
		/*
		
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/fxml3/fxml3.fxml"));
		Scene scene = new Scene(parent);*/    													// tu na scene - brak StackPane
		primaryStage.setScene(scene);
		primaryStage.setTitle("Inicjalizator");
		primaryStage.show();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
