package com.example.demojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Programmazione III - JavaFX OK (JDK 25)");
        Scene scene = new Scene(new StackPane(label), 420, 240);
        stage.setTitle("demoJavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
