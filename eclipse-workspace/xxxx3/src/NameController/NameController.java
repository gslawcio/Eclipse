package NameController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label1;

    @FXML
    private Button button1;

    @FXML
    private Label label2;

    @FXML
    private Button button2;

    @FXML
    void initialize() {
        assert label1 != null : "fx:id=\"label1\" was not injected: check your FXML file 'fxml3.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'fxml3.fxml'.";
        assert label2 != null : "fx:id=\"label2\" was not injected: check your FXML file 'fxml3.fxml'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'fxml3.fxml'.";

    }
}
