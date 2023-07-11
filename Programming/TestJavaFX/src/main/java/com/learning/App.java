package com.learning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();

        Button button = new Button("Button");
        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 600, 400);
        primaryStage.setScene(scene);

        primaryStage.setWidth(550);
        primaryStage.setHeight(450);
        //primaryStage.setResizable(false);
        //primaryStage.setFullScreen(true);
        /*primaryStage.setX(0);
        primaryStage.setY(0);*/

        //primaryStage.initStyle(StageStyle.UTILITY);
        //primaryStage.setOpacity(0.5);

        primaryStage.show();
        primaryStage.setTitle("First GUI Application");
    }

}