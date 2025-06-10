package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class DiceController implements Initializable{

    @FXML
    private Spinner<Integer> inputOne;
    SpinnerValueFactory<Integer> inputOneValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @FXML
    private Spinner<Integer> inputTwo;
    SpinnerValueFactory<Integer> inputTwoValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @FXML
    private Spinner<Integer> inputThree;
    SpinnerValueFactory<Integer> inputThreeValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @FXML
    private Spinner<Integer> inputFour;
    SpinnerValueFactory<Integer> inputFourValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @FXML
    private Spinner<Integer> inputFive;
    SpinnerValueFactory<Integer> inputFiveValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @FXML
    private Spinner<Integer> inputSix;
    SpinnerValueFactory<Integer> inputSixValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @FXML
    private Spinner<Integer> inputSeven;
    SpinnerValueFactory<Integer> inputSevenValueFactory = 
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0,128,0);

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        inputOne.setValueFactory(inputOneValueFactory);
        inputOneValueFactory.setValue(0);

        inputTwo.setValueFactory(inputTwoValueFactory);
        inputOneValueFactory.setValue(0);

        inputThree.setValueFactory(inputThreeValueFactory);
        inputOneValueFactory.setValue(0);

        inputFour.setValueFactory(inputFourValueFactory);
        inputOneValueFactory.setValue(0);

        inputFive.setValueFactory(inputFiveValueFactory);
        inputOneValueFactory.setValue(0);

        inputSix.setValueFactory(inputSixValueFactory);
        inputOneValueFactory.setValue(0);

        inputSeven.setValueFactory(inputSevenValueFactory);
        inputOneValueFactory.setValue(0);

        output.setText("The D4's rolled: " + "\nThe d6's rolled: " + "\nThe d8's rolled: " + "\nThe d10's rolled: " + "\nThe d12's rolled: " + "\nThe d20's rolled: " + "\nThe bonus is: " + "\nThe Total is: ");
    }

    @FXML
    private Button rollButton = new Button();

    @FXML
    Label output = new Label();

    @FXML
    private void rollDice() throws IOException
    {
        int total = 0;
        int dFourTotal = 0;
        int dSixTotal = 0;
        int dEightTotal = 0;
        int dTenTotal = 0;
        int dTwelveTotal = 0;
        int dTwentyTotal = 0;
        for (int i = 0; i < inputOne.getValue(); i++)
        {
            int numberRolled = 0;
            while (numberRolled < 1)
            {
                numberRolled = 0;
                numberRolled += Math.round((Math.random()) * 4);
            }
            total += numberRolled;
            dFourTotal += numberRolled;
        }

        for (int i = 0; i < inputTwo.getValue(); i++)
        {
            int numberRolled = 0;
            while (numberRolled < 1)
            {
                numberRolled = 0;
                numberRolled += Math.round((Math.random()) * 6);
            }
            total += numberRolled;
            dSixTotal += numberRolled;
        }

        for (int i = 0; i < inputThree.getValue(); i++)
        {
            int numberRolled = 0;
            while (numberRolled < 1)
            {
                numberRolled = 0;
                numberRolled += Math.round((Math.random()) * 8);
            }
            total += numberRolled;
            dEightTotal += numberRolled;
        }

        for (int i = 0; i < inputFour.getValue(); i++)
        {
            int numberRolled = 0;
            while (numberRolled < 1)
            {
                numberRolled = 0;
                numberRolled += Math.round((Math.random()) * 10);
            }
            total += numberRolled;
            dTenTotal += numberRolled;
        }

        for (int i = 0; i < inputFive.getValue(); i++)
        {
            int numberRolled = 0;
            while (numberRolled < 1)
            {
                numberRolled = 0;
                numberRolled += Math.round((Math.random()) * 12);
            }
            total += numberRolled;
            dTwelveTotal += numberRolled;
        }

        for (int i = 0; i < inputSix.getValue(); i++)
        {
            int numberRolled = 0;
            while (numberRolled < 1)
            {
                numberRolled = 0;
                numberRolled += Math.round((Math.random()) * 20);
            }
            total += numberRolled;
            dTwentyTotal += numberRolled;
        }

        total += inputSeven.getValue();

        output.setText("The D4's rolled: " + dFourTotal + "\nThe d6's rolled: " + dSixTotal + "\nThe d8's rolled: " + dEightTotal + "\nThe d10's rolled: " + dTenTotal + "\nThe d12's rolled: " + dTwelveTotal + "\nThe d20's rolled: " + dTwentyTotal + "\nThe bonus is: " + inputSeven.getValue() + "\nThe Total is: " + total);
    }

    

            
}
