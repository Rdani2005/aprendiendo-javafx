package com.example.list;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class HelloController {

    @FXML
    private TextField nameIn;

    @FXML
    private ListView<String> namesList;

    @FXML
    void addName(MouseEvent event) {
        namesList.getItems().add(nameIn.getText());
    }

    @FXML
    void removeName(MouseEvent event) {
        int selectedId = namesList.getSelectionModel().getSelectedIndex();
        namesList.getItems().remove(selectedId);
    }

}
