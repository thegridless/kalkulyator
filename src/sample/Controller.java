package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.ImageInput;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import javafx.scene.effect.Effect;

import java.util.ArrayList;
import java.util.ResourceBundle;


/*class CalcButtons extends Button {
    MouseEvent MouseEvent = new MouseEvent();
    private void buttonShadow(MouseEvent.MOUSE_ENTERED) {
        DropShadow shadow = new DropShadow();

        this.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                button.setEffect(shadow);
            }
        });

        button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                button.setEffect(null);
            }
        });
    }*//*

    private void buttonClick(CalcButtons button){
        ImageInput imageInput = new ImageInput();
        Label inPutField = new Label();
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                button.setEffect(imageInput);
                if (inPutField.getText() != null) {
                    inPutField.setText(inPutField.getText() + button.getText());
                } else inPutField.setText(button.getText());
            }
        });
    }
}*/

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonAnswer /*= new CalcButtons()*/;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonDel;

    @FXML
    private Button buttonMultiply;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonDivision;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button button0;

    @FXML
    private Button buttonZ;

    @FXML
    private Button buttonRes;

    @FXML
    private Label inPutField;

    @FXML
    private Label answerField;

    public String inPut;
    public String outPut;


    private void buttonShadow(Button button) {
        DropShadow shadow = new DropShadow();

        button.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                button.setEffect(shadow);
            }
        });

        button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                button.setEffect(null);
            }
        });
    }

    private void buttonClick(Button button) {
        ImageInput imageInput = new ImageInput();

        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                button.setEffect(imageInput);
                if (inPutField.getText() != null) {
                    inPutField.setText(inPutField.getText() + button.getText());
                } else inPutField.setText(button.getText());
            }
        });
    }

    @FXML
    void initialize() {
        ArrayList<Button> buttons = new ArrayList<Button>(16);
        buttons.add(button0);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(buttonPlus);
        buttons.add(buttonPlus);
        buttons.add(buttonMinus);
        buttons.add(buttonDivision);
        buttons.add(buttonMultiply);
        buttons.add(buttonZ);
        buttons.add(buttonDel);
        buttons.add(buttonClear);
        buttons.add(buttonAnswer);
        for (Button x : buttons) {
            this.buttonShadow(x);
            this.buttonClick(x);
        }
    }
}
