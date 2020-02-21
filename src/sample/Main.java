package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Какулятор");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
        primaryStage.setMinWidth(316); primaryStage.setMaxWidth(600);
        primaryStage.setResizable(false);
       // primaryStage.setMinHeight(440); primaryStage.setMaxHeight(800);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
