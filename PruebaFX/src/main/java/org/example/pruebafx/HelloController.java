package org.example.pruebafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;

public class HelloController {

    static Contador cont = new Contador();

    private static int contador;

    @FXML
    private Label welcomeText;

    @FXML
    private Button pruebaPulsaBoton;

    @FXML
    private Label contadorLabel;


    @FXML
    public void initialize() {
        pruebaPulsaBoton.setOnAction(e -> {
            cont.contar();
            contadorLabel.setText(Integer.toString(cont.getContar()));
        });

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public void siguienteClickButton() throws IOException {
        HelloApplication.setRoot("segunda-view");
    }

    public void resetButton() {

        cont.resetear();
        contadorLabel.setText(Integer.toString(cont.getContar()));

    }
}


