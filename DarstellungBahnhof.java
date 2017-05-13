package BahnhofSimulation;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DarstellungBahnhof extends Application {
	

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TextField nameBahnhof = new TextField();
		TextField anzahlGleiseFeld = new TextField();
		textFieldNumeric(anzahlGleiseFeld);
		TextField anzahlZufahrtsGleiseFeld = new TextField();
		textFieldNumeric(anzahlZufahrtsGleiseFeld);
		
		Button zugErstellen = new Button("Zug erstellen");
		zugErstellen.setOnAction(event -> {
			Zug neuerZug = new Zug();
		});
		Button bahnhofErstellen = new Button("Bahnhof erstellen");
		bahnhofErstellen.setOnAction(event -> {
			int anzahlGleise, anzahlZufahrtsGleise;
			String name = nameBahnhof.getText();
		});
		
		
		
		VBox vBoxBahnhof = new VBox();
		vBoxBahnhof.getChildren().add(nameBahnhof);
		vBoxBahnhof.getChildren().add(anzahlGleiseFeld);
		vBoxBahnhof.getChildren().add(anzahlZufahrtsGleiseFeld);
		vBoxBahnhof.getChildren().add(bahnhofErstellen);
		VBox vBoxZuege = new VBox();
		vBoxZuege.getChildren().add(zugErstellen);
		BorderPane hauptFenster = new BorderPane();
		Scene scene = new Scene(hauptFenster, 600, 400);
		primaryStage.setTitle("Bahnhof Simulation");
		hauptFenster.setLeft(vBoxZuege);
		hauptFenster.setRight(vBoxBahnhof);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	
	private void textFieldNumeric(TextField textField) {
		textField.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if(!newValue.matches("\\d*")) {
					textField.setText(newValue.replaceAll("[^\\d]", ""));
				}
			}
		});
	}
}
