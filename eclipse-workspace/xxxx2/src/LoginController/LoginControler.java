package LoginController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private Label userNameLabel;

    @FXML
    private TextField userText;

    @FXML
    private Button userButton;

    @FXML
    void initialize() {
        assert loginAnchorPane != null : "fx:id=\"loginAnchorPane\" was not injected: check your FXML file 'fmxl2.fxml'.";
        assert userNameLabel != null : "fx:id=\"userNameLabel\" was not injected: check your FXML file 'fmxl2.fxml'.";
       // assert userText != null : "fx:id=\"userText\" was not injected: check your FXML file 'fmxl2.fxml'.";
        System.out.println(userNameLabel.getText());
		userText.setText("Wpisz swoje imię");
        assert userButton != null : "fx:id=\"userButton\" was not injected: check your FXML file 'fmxl2.fxml'.";

    }
}
