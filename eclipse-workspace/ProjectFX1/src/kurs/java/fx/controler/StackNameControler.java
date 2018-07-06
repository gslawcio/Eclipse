package kurs.java.fx.controler;

import java.awt.TextArea;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class StackNameControler {

	@FXML
	private Button button1;

	public StackNameControler() {
		System.out.println("Jestem controlerem");
	}

	@FXML
	void initialize() {
		button1.setText("nowa");

		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) { // ustawienia ackji przy kliknięciu
				System.out.println("To jest handler");

			}
		};
		button1.addEventHandler(ActionEvent.ACTION, handler); // zdefiniowanie na przycisku akcji

		EventHandler<ActionEvent> actionX = e -> {
			System.out.println("xxxxx");
		};
		button1.addEventHandler(ActionEvent.ACTION, actionX);

		EventHandler<ActionEvent> actionY = e -> {
			System.out.println("YYYYY");
		};
		button1.addEventHandler(ActionEvent.ANY, actionY);

		EventHandler<MouseEvent> mouseEventLambda = e -> {
			System.out.println("To jest mouse");

		};
		button1.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseEventLambda);

		button1.setOnAction(e -> {
			System.out.println("To jest lambda mouse setOn");
			button1.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseEventLambda); // usunięcie akcji na najeżdżaniu
																					// myszą
		});
	}
}