package com.example.shopping_application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginPageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}