package com.dastrix.portaone;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private TextArea textArea;

    @FXML
    void initialize() {
        button.setOnAction(actionEvent -> {
            String text = textArea.getText();
            Input value = Input.valueOf(text);
            String s = String.valueOf(InputService.finalUniqueChar(value.getText()));
            label.setText(s);
        });
    }
}
