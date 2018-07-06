package pl.javastart.youtufy.controller;
 
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
 
public class MainController implements Initializable {
	
	@FXML
	private MenuPaneController menuPaneController;
	
	@FXML
	private SearchPaneController searchPaneController;
	
	@FXML
	private ContentPaneController contentPaneController;
	
	@FXML
	private ControlPaneController controlPaneController;
 
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	System.out.println(menuPaneController);
    	System.out.println(searchPaneController);
    	System.out.println(contentPaneController);
    	System.out.println(controlPaneController);
    }
}