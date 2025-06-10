package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class DiceController implements Initializable{

    @FXML
    private Spinner<Integer> inputOne;
    SpinnerValueFactory<Integer> inputOneValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        inputOne.setValueFactory(inputOneValueFactory);
        inputOneValueFactory.setValue(0);
        System.out.println(inputOne.getValue());
    }
            
}
