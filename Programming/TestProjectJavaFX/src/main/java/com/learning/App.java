package com.learning;

import com.learning.controller.StackPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/com/learning/fxml/StackPaneWindow.fxml"));
        StackPane stackPane = loader.load();

        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("GUI Application with JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}