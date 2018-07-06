package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ScreenController implements Initializable{

	@FXML
	private WebView webView;
	@FXML
	private TextField textField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		/*
		webView = new WebView();
		WebEngine webEngine = webView.getEngine();
		webEngine.load("http://google.pl");
		*/
		
		WebEngine engine = webView.getEngine();
		engine.load("http://javastart.pl");
		
	}

}
