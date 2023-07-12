package com.learning.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

public class StackPaneController {
    @FXML
    private Button button;

    public StackPaneController(){
        System.out.println("Controller");
    }

    @FXML
    void initialize(){
        button.setText("New button");
    }

    @FXML
    public void onAction(ActionEvent event){
        System.out.println("On action method. The source is: " + event.getSource());
        if(event.getSource() instanceof CheckBox){
            System.out.println("You pressed the checkbox.");
        } else {
            System.out.println("You pressed the button.");
        }
    }
}
