package java_calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        File css = new File("style.css");
        primaryStage.setTitle("Calculator by Game Of Codes");
        Scene scene = new Scene(root, 466, 450);
        scene.getStylesheets().add("file:///" + css.getAbsolutePath().replace("\\", "/"));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
