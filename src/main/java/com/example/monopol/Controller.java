package com.example.monopol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Random;

import java.io.IOException;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button buildButton;
    @FXML
    private Button sellButton;
    @FXML
    private ImageView Player1Image;
    @FXML
    private Button rollButton;
    @FXML
    private ImageView diceImage;

    public void switchToGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("game_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Student Monopoly");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleBuildButton(ActionEvent event) {
        buildButton.setText("Builded");
    }

    @FXML
    private void roll(ActionEvent event) {
        Image dice1 = new Image("C:\\Users\\annas\\IdeaProjects\\Monopol\\src\\main\\resources\\images\\dice1.png");
        Image dice2 = new Image("C:\\Users\\annas\\IdeaProjects\\Monopol\\src\\main\\resources\\images\\dice2.png");
        Image dice3 = new Image("C:\\Users\\annas\\IdeaProjects\\Monopol\\src\\main\\resources\\images\\dice3.png");
        Image dice4 = new Image("C:\\Users\\annas\\IdeaProjects\\Monopol\\src\\main\\resources\\images\\dice4.png");
        Image dice5 = new Image("C:\\Users\\annas\\IdeaProjects\\Monopol\\src\\main\\resources\\images\\dice5.png");
        Image dice6 = new Image("C:\\Users\\annas\\IdeaProjects\\Monopol\\src\\main\\resources\\images\\dice6.png");

        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        switch(n) {
            case 1:
                diceImage.setImage(dice1);
                break;
            case 2:
                diceImage.setImage(dice2);
                break;
            case 3:
                diceImage.setImage(dice3);
                break;
            case 4:
                diceImage.setImage(dice4);
                break;
            case 5:
                diceImage.setImage(dice5);
                break;
            case 6:
                diceImage.setImage(dice6);
                break;
        }
    }
}