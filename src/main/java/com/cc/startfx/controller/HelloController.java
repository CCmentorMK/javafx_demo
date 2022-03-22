package com.cc.startfx.controller;

import com.cc.startfx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField tfName;

    public static String userName;

    // moja własna metoda do otwierania nowego widoku
    private void getNewGame() {
        try {
            userName = tfName.getText();
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/game.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Start game!");
            stage.setScene(scene);
            stage.show();
            Stage stageToClose = (Stage) tfName.getScene().getWindow();
            stageToClose.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void startNewGame(ActionEvent event) {
        getNewGame();
    }

    @FXML
    void startNewGameKeyboard(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            getNewGame();
        }
    }

}