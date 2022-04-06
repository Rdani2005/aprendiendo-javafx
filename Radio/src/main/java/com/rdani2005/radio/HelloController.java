package com.rdani2005.radio;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ToggleGroup animal;

    @FXML
    private Text animalText;

    @FXML
    private RadioButton cat;

    @FXML
    private RadioButton dog;

    @FXML
    void showAnimal(MouseEvent event) {

        animalText.setText(
                "Your Favourite animal is " +
                        ((animal.getSelectedToggle().equals(cat)) ? "cat" : "dog"));
    }

}
