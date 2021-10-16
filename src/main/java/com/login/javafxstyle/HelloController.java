package com.login.javafxstyle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    String successStyle = String.format("-fx-border-color: #4fd800; -fx-border-width: 2; -fx-border-radius: 5;");
    String successStyleGradient = String.format("-fx-text-fill: #4fd800; -fx-effect: dropshadow( one-pass-box , black , 8 , 0.0 , 2 , 0 );");

    /*Import JavaFX controllers*/
    @FXML
    Button cancelButton, signInButton;

    @FXML
    Label errorLabel, loginTitleLabel;

    @FXML
    TextField usernameTextField;

    @FXML
    PasswordField passwordPasswordField;

    /*Close the scene once the cancel button is clicked*/
    @FXML
    protected void onCancelButtonClick() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    /* Make the label with the fx:id of 'errorLabel' change its text and color on Sign in Button click */
    @FXML
    protected void onSignInButtonClick() {
        errorLabel.setText("Sign In Success!");
        errorLabel.setStyle("-fx-text-fill: GREEN;");
        usernameTextField.setStyle(successStyle);
        passwordPasswordField.setStyle(successStyle);
        signInButton.setStyle(successStyleGradient);
    }
}