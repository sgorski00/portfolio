package com.learning;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.show();
        stage.setTitle("First GUI Application");
    }

    public static void main(String[] args) {
        launch();
    }

}