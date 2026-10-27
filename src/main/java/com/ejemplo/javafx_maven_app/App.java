package com.ejemplo.javafx_maven_app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("¡Hola desde JavaFX y Maven en Eclipse!");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("App JavaFX Maven");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}