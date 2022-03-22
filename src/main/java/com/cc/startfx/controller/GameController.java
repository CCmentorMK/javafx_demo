package com.cc.startfx.controller;

import com.cc.startfx.model.Inventory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GameController {

    @FXML
    private TableView<Inventory> tblInventory;
    @FXML
    private TableColumn<Inventory, Integer> tcId;

    @FXML
    private TableColumn<Inventory, String> tcName;

    @FXML
    private TableColumn<Inventory, Integer> tcPts;

    @FXML
    private ImageView iv_0_0;

    @FXML
    private ImageView iv_1_0;

    @FXML
    private Label lblName;

    private ObservableList<Inventory> inventories = FXCollections.observableArrayList();

    @FXML
    void startGame(ActionEvent event) {
        iv_1_0.setImage(new Image("com/cc/startfx/img/player.jpg"));
    }
    // metoda initialize - działa jak konstruktor
    public void initialize(){
        lblName.setText(HelloController.userName);

        inventories.add(new Inventory(1, "Sword", 100));
        inventories.add(new Inventory(2, "Belt", 20));

        tcId.setCellValueFactory(new PropertyValueFactory<>("inventoryId"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("inventoryName"));
        tcPts.setCellValueFactory(new PropertyValueFactory<>("inventoryPts"));
        tblInventory.setItems(inventories);
    }
}
