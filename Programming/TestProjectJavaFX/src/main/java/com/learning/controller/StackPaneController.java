package com.learning.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
}
