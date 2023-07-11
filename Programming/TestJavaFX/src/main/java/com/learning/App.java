package com.learning;

import com.learning.controller.StackPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/StackPaneWindow.fxml"));
        StackPane stackPane = loader.load();

        StackPaneController controller = loader.getController();

        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);

        primaryStage.show();
        primaryStage.setTitle("First GUI Application");
    }

}