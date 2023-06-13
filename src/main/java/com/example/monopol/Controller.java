package com.example.monopol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

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
    private Button rollButton;
    @FXML
    private Button quickRelese;
    @FXML
    private ImageView diceImage;
    @FXML
    private ImageView eventCard;

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
    private TextArea messageBox;

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

    private ArrayList<ImageView> Buildings = new ArrayList<>();
    @FXML
    private ImageView building1;
    @FXML
    private ImageView building2;
    @FXML
    private ImageView building3;
    @FXML
    private ImageView building4;
    @FXML
    private ImageView building5;
    @FXML
    private ImageView building6;
    @FXML
    private ImageView building7;
    @FXML
    private ImageView building8;
    @FXML
    private ImageView building9;
    @FXML
    private ImageView building10;
    @FXML
    private ImageView building11;
    @FXML
    private ImageView building12;
    @FXML
    private ImageView building13;
    @FXML
    private ImageView building14;
    @FXML
    private ImageView building15;
    @FXML
    private ImageView building16;
    @FXML
    private ImageView building17;
    @FXML
    private ImageView building18;
    @FXML
    private ImageView building19;
    @FXML
    private ImageView building20;
    @FXML
    private ImageView building21;
    @FXML
    private ImageView building22;
    @FXML
    private ImageView building23;
    @FXML
    private ImageView building24;
    @FXML
    private ImageView building25;
    @FXML
    private ImageView building26;
    @FXML
    private ImageView building27;
    @FXML
    private ImageView building28;
    @FXML
    private ImageView building29;
    @FXML
    private ImageView building30;
    @FXML
    private ImageView building31;
    @FXML
    private ImageView building32;
    @FXML
    private ImageView building33;
    @FXML
    private ImageView building34;
    @FXML
    private ImageView building35;
    @FXML
    private ImageView building36;
    @FXML
    private ImageView building37;
    @FXML
    private ImageView building38;
    @FXML
    private ImageView building39;
    @FXML
    private ImageView building40;



    Image dice1 = new Image("file:src/main/resources/images/dice1.png");
    Image dice2 = new Image("file:src/main/resources/images/dice2.png");
    Image dice3 = new Image("file:src/main/resources/images/dice3.png");
    Image dice4 = new Image("file:src/main/resources/images/dice4.png");
    Image dice5 = new Image("file:src/main/resources/images/dice5.png");
    Image dice6 = new Image("file:src/main/resources/images/dice6.png");


    Media ost = new Media(new File("src/main/resources/NecoArcDilemma.mp3").toURI().toString());
    Media eventCardSound = new Media(new File("src/main/resources/EventCard.mp3").toURI().toString());

    MediaPlayer mediaPlayer = new MediaPlayer(ost);
//    MediaPlayer mediaPlayerEventCard = new MediaPlayer(eventCardSound);


    public void switchToGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("game_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        mediaPlayer.setVolume(0.30);
        mediaPlayer.play();
    }

    public void switchToRules(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("rules_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToStart(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("start.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exitGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("start.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleBuyButton(ActionEvent event) {
        messageBox.setText(gameEngine.buyField(gameEngine.getPlayerTurn()));
        updateBalance();
        showFieldBelongings();
    }
    @FXML
    private void handleSellButton(ActionEvent event) {
        messageBox.setText(gameEngine.sellField(gameEngine.getPlayerTurn()));
        updateBalance();
//        showFieldBelongings();
        Fields.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())).setStyle("");
        Buildings.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())).setOpacity(0);
    }
    @FXML
    private void handleBuildButton(ActionEvent event) {
        messageBox.setText(gameEngine.buildHouse(gameEngine.getPlayerTurn()));
        updateBalance();
        if(gameEngine.isBuilt(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn()))) {
            Buildings.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())).setOpacity(1);
        }
//        showFieldBelongings();
    }
    @FXML
    private void quickReleaseButton(ActionEvent event) {
        messageBox.setText("Uzywasz karty pominiecia tur!");
        gameEngine.setPlayerSkipTurns(gameEngine.getPlayerTurn(), 0);
        endButton.setDisable(true);
        rollButton.setDisable(false);
        buyButton.setDisable(false);
        buildButton.setDisable(false);
        quickRelese.setOpacity(0);
        quickRelese.setDisable(true);
    }

    private void updateBalance() {
        Player1Balance.setText(Integer.toString(gameEngine.getPlayerBalance(1)));
        Player2Balance.setText(Integer.toString(gameEngine.getPlayerBalance(2)));
        Player3Balance.setText(Integer.toString(gameEngine.getPlayerBalance(3)));
        Player4Balance.setText(Integer.toString(gameEngine.getPlayerBalance(4)));
    }

    @FXML
    private void handleEndButton(ActionEvent event) {
        eventCard.setImage(null);
        hideFieldBelongings();
        gameEngine.endTurn();
        boolean turnSkipVal = gameEngine.checkIfSkipTurn(gameEngine.getPlayerTurn());
        messageBox.setText("Teraz tura gracza: " + gameEngine.getPlayerTurn());
        showFieldBelongings();
        if(turnSkipVal){
            endButton.setDisable(false);
            rollButton.setDisable(true);
            buyButton.setDisable(true);
            buildButton.setDisable(true);
            messageBox.setText("Musisz czekać jeszcze: " + (gameEngine.getPlayerSkipTurn(gameEngine.getPlayerTurn())+1) + " kolejki");
            if(gameEngine.hasPlayerQuickRelese(gameEngine.getPlayerTurn())){
                quickRelese.setOpacity(1);
                quickRelese.setDisable(false);
            }
        }else {
            endButton.setDisable(true);
            rollButton.setDisable(false);
            buyButton.setDisable(false);
            buildButton.setDisable(false);
            quickRelese.setOpacity(0);
            quickRelese.setDisable(true);
        }
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
        rollButton.setDisable(true);
        endButton.setDisable(false);

        if(!arrayCreated) {
            createFieldsArray();
            createBuildingsArray();
            arrayCreated = true;
        }

        Random rand = new Random();
        int n = rand.nextInt(1, 7);
//        n = 3;
        switch (n) {
            case 1 -> diceImage.setImage(dice1);
            case 2 -> diceImage.setImage(dice2);
            case 3 -> diceImage.setImage(dice3);
            case 4 -> diceImage.setImage(dice4);
            case 5 -> diceImage.setImage(dice5);
            case 6 -> diceImage.setImage(dice6);
        }
        gameEngine.movePlayer(gameEngine.getPlayerTurn(), n);
        int playerPosition = gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn());
        int playerMovement = gameEngine.eventFieldValidation(gameEngine.getPlayerTurn(), messageBox, eventCard, eventCardSound);
        if(playerMovement != playerPosition){
            movePawnToStart(gameEngine.getPlayerTurn());
            movePawn(playerMovement, gameEngine.getPlayerTurn());
        }else{
            movePawn(n, gameEngine.getPlayerTurn());
        }
        gameEngine.houseFieldValidation(gameEngine.getPlayerTurn(), messageBox);
        gameEngine.specialFieldValidation(gameEngine.getPlayerTurn(), messageBox);
        updateBalance();
    }

    public void movePawnToStart(int playerNumber) {
        switch (playerNumber){
            case 1 -> {
                Player1Pawn.setX(0);
                Player1Pawn.setY(0);
            }
            case 2 -> {
                Player2Pawn.setX(0);
                Player2Pawn.setY(0);
            }
            case 3 -> {
                Player3Pawn.setX(0);
                Player3Pawn.setY(0);
            }
            case 4 -> {
                Player4Pawn.setX(0);
                Player4Pawn.setY(0);
            }
        }
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

    private void createFieldsArray() {
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

    private void createBuildingsArray() {
        Buildings.add(building1);
        Buildings.add(building2);
        Buildings.add(building3);
        Buildings.add(building4);
        Buildings.add(building5);
        Buildings.add(building6);
        Buildings.add(building7);
        Buildings.add(building8);
        Buildings.add(building9);
        Buildings.add(building10);
        Buildings.add(building11);
        Buildings.add(building12);
        Buildings.add(building13);
        Buildings.add(building14);
        Buildings.add(building15);
        Buildings.add(building16);
        Buildings.add(building17);
        Buildings.add(building18);
        Buildings.add(building19);
        Buildings.add(building20);
        Buildings.add(building21);
        Buildings.add(building22);
        Buildings.add(building23);
        Buildings.add(building24);
        Buildings.add(building25);
        Buildings.add(building26);
        Buildings.add(building27);
        Buildings.add(building28);
        Buildings.add(building29);
        Buildings.add(building30);
        Buildings.add(building31);
        Buildings.add(building32);
        Buildings.add(building33);
        Buildings.add(building34);
        Buildings.add(building35);
        Buildings.add(building36);
        Buildings.add(building37);
        Buildings.add(building38);
        Buildings.add(building39);
        Buildings.add(building40);
    }
}