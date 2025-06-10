package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class DiceController {

    @FXML
    private Spinner<Integer> inputOne;
    SpinnerValueFactory<Integer> inputOneValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(1,128,1);

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        inputOne.setValueFactory(inputOneValueFactory);
        inputOneValueFactory.setValue(0);
    }
            
}
