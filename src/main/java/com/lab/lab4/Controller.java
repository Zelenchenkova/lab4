package com.lab.lab4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    int click;

    @FXML Label task;
    @FXML Label answer;
    @FXML ImageView imageFX;
    @FXML Image image;

    @FXML
    public void initialize() {
        task.setText(Data.TASK);
        imageFX.setImage(image);
        answer.setText("");
        imageFX.setVisible(false);
    }

    @FXML
    protected void onButtonClick() {
        click++;
        if(click % 2 != 0) {
            answer.setText(Data.ANSWER);
            imageFX.setVisible(true);
        }else {
            answer.setText("");
            imageFX.setVisible(false);
        }

    }
}