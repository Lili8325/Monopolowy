package com.example.monopol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

public class MenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    boolean musicOn;

    @FXML
    TextField maxBalanceTextField;
    @FXML
    CheckBox musicCheckBox;
    @FXML
    CheckBox soundsCheckBox;
    @FXML
    Label notification;

    Media ost = new Media(new File("src/main/resources/NecoArcDilemma.mp3").toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(ost);

    public void switchToGame(ActionEvent event) throws IOException {
        try {
            musicOn = musicCheckBox.isSelected();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game_scene.fxml"));
            root = loader.load();

            Controller game_sceneController = loader.getController();

            game_sceneController.soundsOn = soundsCheckBox.isSelected();
            game_sceneController.gameEngine.setMaxBalance(Integer.parseInt(maxBalanceTextField.getText()));

            game_sceneController.createFieldsArray();
            game_sceneController.createBuildingsArray();
            game_sceneController.createQuickReleaseArray();

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            if(musicOn) {
                mediaPlayer.setOnEndOfMedia(new Runnable() {
                    public void run() {
                        mediaPlayer.seek(Duration.ZERO);
                    }
                });
                mediaPlayer.setVolume(0.30);
                mediaPlayer.play();
            }
        } catch (NumberFormatException e) {
            maxBalanceTextField.setStyle("-fx-border-color: red; -fx-border-width: 2px");
            notification.setOpacity(1);
        }
    }

    public void switchToStart(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("start_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
