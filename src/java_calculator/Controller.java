package java_calculator;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;


public class Controller {


    @FXML
    private void handleButtonAction(ActionEvent e) {
        // cast ActionEvent type variable called e to Button type & call getSource().getText() on it
        // to retrieve its text value
        String value = ((Button) e.getSource()).getText();
        System.out.println(value);
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
            default:
                result = 0;
                return result;

        }




    }



}
