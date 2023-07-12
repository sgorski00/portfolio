package com.learning.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

public class StackPaneController {
    @FXML
    private Button secondButton;

    public StackPaneController(){
        System.out.println("Controller");
    }

    @FXML
    void initialize(){
        secondButton.setText("TestButton");

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("On action button coded in Java.");
            }
        };
        secondButton.addEventHandler(ActionEvent.ACTION, handler);

        EventHandler<MouseEvent> mouseHandlerLambda = e -> {
            System.out.println("This is mouse handler coded in lambda");
        };
        secondButton.addEventHandler(MouseEvent.MOUSE_RELEASED, mouseHandlerLambda);
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
