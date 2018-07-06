package PersonView;

import java.time.LocalDate;

import javafx.beans.binding.When;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonViewModel {

	// textField imię
	private StringProperty nameProperty = new SimpleStringProperty();
	
	//widoczność/niewidoczność pola label OK imię
	private BooleanProperty nameOkProperty = new SimpleBooleanProperty(false);
	
	// textField nazwisko
	private StringProperty surnameProperty = new SimpleStringProperty();
	
	// włącznie / wyłącznie pola nazwisko
		private BooleanProperty disableSurameProperty = new SimpleBooleanProperty(true);
		//widoczność/niewidoczność pola label OK nazwisko
		private BooleanProperty surnameOkProperty = new SimpleBooleanProperty(false);
		
		//textField - rok urodzenia
		private IntegerProperty yeraProperty = new SimpleIntegerProperty();
		
		// przyjmuje wartośc pola checkBox
		private BooleanProperty confirmProperty = new SimpleBooleanProperty(false);
		
		//obliczony wiek
		private StringProperty ageProperty = new SimpleStringProperty();
		
		//włącz / wyłącz przycisk zaloguj
		private BooleanProperty buttonProperty = new SimpleBooleanProperty(false);
		
		//aktualny rok
		private IntegerProperty actualyYearProperty = new SimpleIntegerProperty(LocalDate.now().getYear());
		
		public PersonViewModel() {
			nameOkProperty.bind(nameProperty.isNotEmpty()); // sprawdzamy czy pole nameProperty nie jest puste. Jeśli nie jest wyświetla się OK
			surnameOkProperty.bind(surnameProperty.isNotEmpty());		//sprawdzamy czy surnameProperty nie jest puste.
			disableSurameProperty.bind(nameProperty.isEmpty());
			buttonProperty.bind(confirmProperty.not());			// włącza przycisk zaloguj- buttonProperty(logginBotton) po zaznaczeniu w confirmProperty(checkBox)
			ageProperty.bind(new When(yeraProperty.isNotEqualTo(0))
					.then(actualyYearProperty.subtract(yeraProperty).asString()).otherwise(""));
		}
		public StringProperty getNameProperty() {
			return nameProperty;
		}

		public void setNameProperty(StringProperty nameProperty) {
			this.nameProperty = nameProperty;
		}

		public BooleanProperty getNameOkProperty() {
			return nameOkProperty;
		}

		public void setNameOkProperty(BooleanProperty nameOkProperty) {
			this.nameOkProperty = nameOkProperty;
		}

		public StringProperty getSurnameProperty() {
			return surnameProperty;
		}

		public void setSurnameProperty(StringProperty surnameProperty) {
			this.surnameProperty = surnameProperty;
		}

		public BooleanProperty getDisableSurameProperty() {
			return disableSurameProperty;
		}

		public void setDisableSurameProperty(BooleanProperty disableSurameProperty) {
			this.disableSurameProperty = disableSurameProperty;
		}

		public BooleanProperty getSurnameOkProperty() {
			return surnameOkProperty;
		}

		public void setSurnameOkProperty(BooleanProperty surnameOkProperty) {
			this.surnameOkProperty = surnameOkProperty;
		}

		public IntegerProperty getYeraProperty() {
			return yeraProperty;
		}

		public void setYeraProperty(IntegerProperty yeraProperty) {
			this.yeraProperty = yeraProperty;
		}

		public BooleanProperty getConfirmProperty() {
			return confirmProperty;
		}

		public void setConfirmProperty(BooleanProperty confirmProperty) {
			this.confirmProperty = confirmProperty;
		}

		public StringProperty getAgeProperty() {
			return ageProperty;
		}

		public void setAgeProperty(StringProperty ageProperty) {
			this.ageProperty = ageProperty;
		}

		public BooleanProperty getButtonProperty() {
			return buttonProperty;
		}

		public void setButtonProperty(BooleanProperty buttonProperty) {
			this.buttonProperty = buttonProperty;
		}

		public IntegerProperty getActualyYearProperty() {
			return actualyYearProperty;
		}

		public void setActualyYearProperty(IntegerProperty actualyYearProperty) {
			this.actualyYearProperty = actualyYearProperty;
		}

}
