package com.example.shopping_application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginPageController {
    @FXML
    private AnchorPane admin_form;

    @FXML
    private Hyperlink admin_hyperlink;

    @FXML
    private Button admin_loginBtn;

    @FXML
    private PasswordField admin_password;

    @FXML
    private TextField admin_username;

    @FXML
    private AnchorPane customer_form;

    @FXML
    private Hyperlink customer_hyperlink;

    @FXML
    private Button customer_loginBtn;

    @FXML
    private PasswordField customer_password;

    @FXML
    private TextField customer_username;

    @FXML
    private AnchorPane main_form;


    //Database Tools

    public void switchForm(ActionEvent event)
    {
        if(event.getSource() == admin_hyperlink)
        {
            admin_form.setVisible(false);
            customer_form.setVisible(true);
        }
        else if(event.getSource() == customer_hyperlink)
        {
            admin_form.setVisible(true);
            customer_form.setVisible(false);
        }
    }

    public void close()
    {
        System.exit(0);
    }
}