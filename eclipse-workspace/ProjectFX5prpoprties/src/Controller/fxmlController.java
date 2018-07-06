package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import PersonView.PersonViewModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class fxmlController implements Initializable {

    @FXML
    private TextField nameTextField;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField surnameTextField;
    @FXML
    private Label surnameLabel;

    @FXML
    private TextField yearTextField;

    @FXML
    private CheckBox confirmCheckBox;

    @FXML
    private Label ageLabel;

    @FXML
    private Button logginButton;

    private PersonViewModel personViewModel = new PersonViewModel();
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// bindujemy nameTextField z getNameProerty z klacy PersonViewMOdel oraz pole nazwisko-surnameTextField z polem getSurmaneProperty
		nameTextField.textProperty().bindBidirectional(personViewModel.getNameProperty());
		surnameTextField.textProperty().bindBidirectional(personViewModel.getSurnameProperty());
		
		// łączymy pole nazwisko surmaneTextField z getDisableSurnameProperty 
		//będzie włączać i wyłączać pole . Jest typu boolean
		surnameTextField.disableProperty().bind(personViewModel.getDisableSurameProperty());
		
		// powołujemy konwenter do zamiany Stringa na Integer
		StringConverter conventer = new NumberStringConverter();
		
		//bindowanie z konvekterem . Chcmy zamienić stringa na Integer
		//pole yearTExtField z getYearProperty z klasy personVievM...  po przecinku dodajemy convecter
		yearTextField.textProperty().bindBidirectional(personViewModel.getYeraProperty(), conventer);
			//bindujemy selecta 
		confirmCheckBox.selectedProperty().bindBidirectional(personViewModel.getConfirmProperty());
		
		// pole ageLabel z ageProperty wyświetla wiek
		ageLabel.textProperty().bind(personViewModel.getAgeProperty());
		
		nameLabel.visibleProperty().bind(personViewModel.getNameOkProperty());
		surnameLabel.visibleProperty().bind(personViewModel.getSurnameOkProperty());
		
		logginButton.disableProperty().bind(personViewModel.getButtonProperty());
		
	}

}
