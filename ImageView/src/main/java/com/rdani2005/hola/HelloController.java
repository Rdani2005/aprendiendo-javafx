package com.rdani2005.hola;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private ImageView image;

    @FXML

    void showImage(MouseEvent event) {
        image.setVisible(true);
    }
}