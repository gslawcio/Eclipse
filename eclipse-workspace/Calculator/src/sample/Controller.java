package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField textArea;
    @FXML
    private Button clear;
    @FXML
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    @FXML
    public void actionButton0() {
        String value = textArea.getText();
        String set = "0";
        textArea.setText(value + set);
    }
    @FXML
    public void actionButton1() {
        String value = textArea.getText();
        String set = "1";
        textArea.setText(value + set);
    }
    @FXML
    public void actionButton2() {
        String value = textArea.getText();
        String set = "2";
        textArea.setText(value + set);
    }@FXML
    public void actionButton3() {
        String value = textArea.getText();
        String set = "3";
        textArea.setText(value + set);
    }@FXML
    public void actionButton4() {
        String value = textArea.getText();
        String set = "4";
        textArea.setText(value + set);
    }@FXML
    public void actionButton5() {
        String value = textArea.getText();
        String set = "5";
        textArea.setText(value + set);
    }@FXML
    public void actionButton6() {
        String value = textArea.getText();
        String set = "6";
        textArea.setText(value + set);
    }@FXML
    public void actionButton7() {
        String value = textArea.getText();
        String set = "7";
        textArea.setText(value + set);
    }@FXML
    public void actionButton8() {
        String value = textArea.getText();
        String set = "8";
        textArea.setText(value + set);
    }@FXML
    public void actionButton9() {
        String value = textArea.getText();
        String set = "9";
        textArea.setText(value + set);
    }
    @FXML
    public void actionClear() {
        //String value = textArea.getText();
        //value = "";
        //textArea.setText(value);
        textArea.clear();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
