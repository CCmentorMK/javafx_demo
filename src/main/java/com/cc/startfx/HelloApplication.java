package com.cc.startfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// dzidziczenie po klasie Application
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // dodanie zasobu graficznego do obiektu FXML
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/hello-view.fxml"));
        // obiekt sceny (okna) aplikacji do którego dodano FXML
        Scene scene = new Scene(fxmlLoader.load());
        // ustawienie tytułu okna
        stage.setTitle("Start game!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}