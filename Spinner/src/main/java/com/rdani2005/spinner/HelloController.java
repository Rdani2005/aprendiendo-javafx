package com.rdani2005.spinner;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Spinner<Integer> number;

    SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);

    @FXML
    private Text text;

    @FXML
    void addNumber(MouseEvent event) {
        text.setText("You are " + number.getValue() + " years old!");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        number.setValueFactory(svf);
    }
}
