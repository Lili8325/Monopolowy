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
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

/*
todo - pawns movement
todo - highligting the fields
 */
public class Controller {

    private static final int FIELD_WIDTH = 84;

    private static final int X_1_OFFSET = 0;
    private static final int X_2_OFFSET = -15;
    private static final int X_3_OFFSET = 50;
    private static final int X_4_OFFSET = 35;

    private static final int Y_1_OFFSET = 0;
    private static final int Y_2_OFFSET = 0;
    private static final int Y_3_OFFSET = -50;
    private static final int Y_4_OFFSET = -50;

    GameEngine gameEngine = new GameEngine(4);

    private boolean arrayCreated = false;

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button buyButton;
    @FXML
    private Button buildButton;
    @FXML
    private Button endButton;
    @FXML
    private ImageView Player1Image;
    @FXML
    private Button rollButton;
    @FXML
    private ImageView diceImage;

    @FXML
    private Pane Player1Pane;
    @FXML
    private Pane Player2Pane;
    @FXML
    private Pane Player3Pane;
    @FXML
    private Pane Player4Pane;


    @FXML
    private ImageView Player1Pawn;
    @FXML
    private ImageView Player2Pawn;
    @FXML
    private ImageView Player3Pawn;
    @FXML
    private ImageView Player4Pawn;

    @FXML
    private TextField Player1Balance;
    @FXML
    private TextField Player2Balance;
    @FXML
    private TextField Player3Balance;
    @FXML
    private TextField Player4Balance;

    @FXML
    private TextField messageBox;

    private ArrayList<Pane> Fields = new ArrayList<>();

    @FXML
    private Pane Field1;
    @FXML
    private Pane Field2;
    @FXML
    private Pane Field3;
    @FXML
    private Pane Field4;
    @FXML
    private Pane Field5;
    @FXML
    private Pane Field6;
    @FXML
    private Pane Field7;
    @FXML
    private Pane Field8;
    @FXML
    private Pane Field9;
    @FXML
    private Pane Field10;
    @FXML
    private Pane Field11;
    @FXML
    private Pane Field12;
    @FXML
    private Pane Field13;
    @FXML
    private Pane Field14;
    @FXML
    private Pane Field15;
    @FXML
    private Pane Field16;
    @FXML
    private Pane Field17;
    @FXML
    private Pane Field18;
    @FXML
    private Pane Field19;
    @FXML
    private Pane Field20;
    @FXML
    private Pane Field21;
    @FXML
    private Pane Field22;
    @FXML
    private Pane Field23;
    @FXML
    private Pane Field24;
    @FXML
    private Pane Field25;
    @FXML
    private Pane Field26;
    @FXML
    private Pane Field27;
    @FXML
    private Pane Field28;
    @FXML
    private Pane Field29;
    @FXML
    private Pane Field30;
    @FXML
    private Pane Field31;
    @FXML
    private Pane Field32;
    @FXML
    private Pane Field33;
    @FXML
    private Pane Field34;
    @FXML
    private Pane Field35;
    @FXML
    private Pane Field36;
    @FXML
    private Pane Field37;
    @FXML
    private Pane Field38;
    @FXML
    private Pane Field39;
    @FXML
    private Pane Field40;



    Image dice1 = new Image("file:src/main/resources/images/dice1.png");
    Image dice2 = new Image("file:src/main/resources/images/dice2.png");
    Image dice3 = new Image("file:src/main/resources/images/dice3.png");
    Image dice4 = new Image("file:src/main/resources/images/dice4.png");
    Image dice5 = new Image("file:src/main/resources/images/dice5.png");
    Image dice6 = new Image("file:src/main/resources/images/dice6.png");



    public void switchToGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("game_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Student Monopoly");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleBuyButton(ActionEvent event) {
        messageBox.setText(gameEngine.buyField(gameEngine.getPlayerTurn()));
        updateBalance();
        showFieldBelongings();
    }

    private void updateBalance() {
        Player1Balance.setText(Integer.toString(gameEngine.getPlayerBalance(1)));
        Player2Balance.setText(Integer.toString(gameEngine.getPlayerBalance(2)));
        Player3Balance.setText(Integer.toString(gameEngine.getPlayerBalance(3)));
        Player4Balance.setText(Integer.toString(gameEngine.getPlayerBalance(4)));
    }

    @FXML
    private void handleEndButton(ActionEvent event) {
        hideFieldBelongings();
        gameEngine.endTurn();
        messageBox.setText("Teraz tura gracza: " + gameEngine.getPlayerTurn());
        showFieldBelongings();
//        rollButton.setDisable(false);
//        endButton.setDisable(true);
        int turn = gameEngine.getPlayerTurn();
        switch (turn) {
            case 1 -> {
                Player1Pane.setStyle("-fx-border-color: yellow; -fx-border-width: 4px; -fx-background-color: rgba(255, 255, 0, 0.3);");
                Player2Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player3Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player4Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
            }
            case 2 -> {
                Player1Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player2Pane.setStyle("-fx-border-color: yellow; -fx-border-width: 4px; -fx-background-color: rgba(255, 255, 0, 0.3);");
                Player3Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player4Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
            }
            case 3 -> {
                Player1Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player2Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player3Pane.setStyle("-fx-border-color: yellow; -fx-border-width: 4px; -fx-background-color: rgba(255, 255, 0, 0.3);");
                Player4Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
            }
            case 4 -> {
                Player1Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player2Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player3Pane.setStyle("-fx-border-color: black; -fx-background-color: #D1EBE3;");
                Player4Pane.setStyle("-fx-border-color: yellow; -fx-border-width: 4px; -fx-background-color: rgba(255, 255, 0, 0.3);");
            }
        }
        updateBalance();
    }

    @FXML
    private void roll(ActionEvent event) {
//        rollButton.setDisable(true);
//        endButton.setDisable(false);

        if(!arrayCreated) {
            createArray();
            arrayCreated = true;
        }

        Random rand = new Random();
        int n = rand.nextInt(1, 7);
        n = 1;
        switch (n) {
            case 1 -> diceImage.setImage(dice1);
            case 2 -> diceImage.setImage(dice2);
            case 3 -> diceImage.setImage(dice3);
            case 4 -> diceImage.setImage(dice4);
            case 5 -> diceImage.setImage(dice5);
            case 6 -> diceImage.setImage(dice6);
        }
        gameEngine.movePlayer(gameEngine.getPlayerTurn(), n);
//        int playerMovement = gameEngine.eventFieldValidation(gameEngine.getPlayerTurn());
//        System.out.println(playerMovement);
//        if(playerMovement != 0){
//            messageBox.setText("Player moved: " + playerMovement);
//            while (gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn()) < playerMovement){
//                movePawn(1, gameEngine.getPlayerTurn());
//            }
//        }else{
//            movePawn(n, gameEngine.getPlayerTurn());
//        }
        movePawn(n, gameEngine.getPlayerTurn());
    }

    public void movePawn(int move, int playerNumber){
        switch (playerNumber){
            case 1 -> {
                for(int i = 0; i < move; ++i) {
                    movePawns(Player1Pawn, X_1_OFFSET, Y_1_OFFSET);
                }
            }
            case 2 -> {
                for(int i = 0; i < move; ++i) {
                    movePawns(Player2Pawn, X_2_OFFSET, Y_2_OFFSET);
                }
            }
            case 3 -> {
                for(int i = 0; i < move; ++i) {
                    movePawns(Player3Pawn, X_3_OFFSET, Y_3_OFFSET);
                }
            }
            case 4 -> {
                for(int i = 0; i < move; ++i) {
                    movePawns(Player4Pawn, X_4_OFFSET, Y_4_OFFSET);
                }
            }
        }
        updateBalance();
    }

    public void movePawns(ImageView Pawn, int xOffset, int yOffset) {
        if(Pawn.getY() == 0) {
            if(Pawn.getX() != -924) {
                Pawn.setX(Pawn.getX() - FIELD_WIDTH);
            } else {
                Pawn.setX(-995 + xOffset);
                Pawn.setY(-100 + yOffset);
            }
        } else if(Pawn.getX() == -995 + xOffset) {
            if(Pawn.getY() != -688 + yOffset) {
                Pawn.setY(Pawn.getY() - FIELD_WIDTH);
            } else {
                Pawn.setX(-924);
                Pawn.setY(-850);
            }
        } else if (Pawn.getY() == -850) {
            if(Pawn.getX() != 0) {
                Pawn.setX(Pawn.getX() + FIELD_WIDTH);
            } else {
                Pawn.setX(35 + xOffset);
                Pawn.setY(-688 + yOffset);
            }
        } else if(Pawn.getX() == 35 + xOffset) {
            if(Pawn.getY() != -100 + yOffset) {
                Pawn.setY(Pawn.getY() + FIELD_WIDTH);
            } else {
                Pawn.setX(0);
                Pawn.setY(0);
            }
        }
    }

    void showFieldBelongings() {
        ArrayList<Integer> fieldBelongings = gameEngine.getFieldBelongings(gameEngine.getPlayerTurn());
        for (Integer fieldNumber: fieldBelongings) {
            Fields.get(fieldNumber).setStyle("-fx-border-color: yellow; -fx-border-width: 4px; -fx-background-color: rgba(255, 255, 0, 0.3);");
        }
    }

    void hideFieldBelongings() {
        ArrayList<Integer> fieldBelongings = gameEngine.getFieldBelongings(gameEngine.getPlayerTurn());
        for (Integer fieldNumber: fieldBelongings) {
            Fields.get(fieldNumber).setStyle("");
        }
    }

    private void createArray() {
        Fields.add(Field1);
        Fields.add(Field2);
        Fields.add(Field3);
        Fields.add(Field4);
        Fields.add(Field5);
        Fields.add(Field6);
        Fields.add(Field7);
        Fields.add(Field8);
        Fields.add(Field9);
        Fields.add(Field10);
        Fields.add(Field11);
        Fields.add(Field12);
        Fields.add(Field13);
        Fields.add(Field14);
        Fields.add(Field15);
        Fields.add(Field16);
        Fields.add(Field17);
        Fields.add(Field18);
        Fields.add(Field19);
        Fields.add(Field20);
        Fields.add(Field21);
        Fields.add(Field22);
        Fields.add(Field23);
        Fields.add(Field24);
        Fields.add(Field25);
        Fields.add(Field26);
        Fields.add(Field27);
        Fields.add(Field28);
        Fields.add(Field29);
        Fields.add(Field30);
        Fields.add(Field31);
        Fields.add(Field32);
        Fields.add(Field33);
        Fields.add(Field34);
        Fields.add(Field35);
        Fields.add(Field36);
        Fields.add(Field37);
        Fields.add(Field38);
        Fields.add(Field39);
        Fields.add(Field40);
    }
}