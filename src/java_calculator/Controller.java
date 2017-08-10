package java_calculator;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.Arrays;
import java.lang.Math;


public class Controller {
    String number1 = "";
    String number2 = "";
    String operator = "";
    Boolean isDecimalNum1 = true;
    Boolean isDecimalNum2 = true;

    @FXML
    private TextField TextField;


    @FXML
    private void handleButtonAction(ActionEvent e) {
        String value = ((Button) e.getSource()).getText();
        String[] digits = {"0", "1", "2",  "3",  "4", "5", "6", "7", "8", "9"};
        String[] operators = {"/", "+", "-", "*", "MOD", "xʸ"};
        if (value.equals("=EGGYELLŐ=") && number2 != ""){
            String toTextField = String.valueOf(handleCalculation(number1, number2, operator));
            TextField.setText(toTextField);
            number1 = toTextField;
            number2 = "";
            isDecimalNum1 = true;
            isDecimalNum2 = true;
        }
        if (value.equals("C") ){
            number1 = "";
            number2 = "";
            operator = "";
            TextField.setText("");
            isDecimalNum1 = true;
            isDecimalNum2 = true;
        }
        if (Arrays.asList(operators).contains(value) && !number1.equals("") ){
            operator = value;
            TextField.setText(number1 + operator);
        }
        if (Arrays.asList(digits).contains(value) && operator != "" ){
            number2 += value;
            TextField.setText(number1 + operator + number2);
        }
        if (Arrays.asList(digits).contains(value) && operator == "" ){
            number1 += value;
            TextField.setText(number1);
        }
        if (value.equals(".") && isDecimalNum1 == true && operator == "" ) {
            number1 += value;
            isDecimalNum1 = false;
            TextField.setText(number1);
        }
        if (value.equals(".") && isDecimalNum2 == true && operator != "" ) {
            number2 += value;
            isDecimalNum2 = false;
            TextField.setText(number1 + operator + number2);
        }
    }

    @FXML
    private double handleCalculation(String num1, String num2, String operator) {
        double firstNum, secondNum, result;
        firstNum = Double.parseDouble(num1);
        secondNum = Double.parseDouble(num2);

        switch (operator) {
            case "+" :
                result = firstNum + secondNum;
                return result;
            case "-":
                result = firstNum - secondNum;
                return result;
            case "*":
                result = firstNum * secondNum;
                return result;
            case "/":
                result = firstNum / secondNum;
                    return result;
            case "MOD":
                result = firstNum % secondNum;
                return result;
            case "xʸ":
                result = Math.pow(firstNum, secondNum);
                return result;
            default:
                result = 0;
                return result;

        }
    }
}
