package java_calculator;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {


    @FXML
    private void handleButtonAction(ActionEvent e) {
        // cast ActionEvent type variable called e to Button type & call getSource().getText() on it
        // to retrieve its text value
        String value = ((Button) e.getSource()).getText();
        System.out.println(value);
    }



}
