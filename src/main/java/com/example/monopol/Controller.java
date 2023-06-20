package com.example.monopol;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
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

    private Stage stage;
    private Scene scene;
    private Parent root;

    boolean soundsOn;

    @FXML
    private Button buyButton;
    @FXML
    private Button buildButton;
    @FXML
    private Button endButton;
    @FXML
    private Button rollButton;
    @FXML
    private Button sellButton;

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
    private Image quickReleaseSymbol = new Image("file:src/main/resources/images/quickRelease.png");

    private ArrayList<ImageView> quickReleaseSymbols = new ArrayList<>();

    @FXML
    private ImageView quickReleaseSymbol1;
    @FXML
    private ImageView quickReleaseSymbol2;
    @FXML
    private ImageView quickReleaseSymbol3;
    @FXML
    private ImageView quickReleaseSymbol4;

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

    private ArrayList<Image> dices = new ArrayList<>();
    private Image dice1 = new Image("file:src/main/resources/images/dices/dice1.png");
    private Image dice2 = new Image("file:src/main/resources/images/dices/dice2.png");
    private Image dice3 = new Image("file:src/main/resources/images/dices/dice3.png");
    private Image dice4 = new Image("file:src/main/resources/images/dices/dice4.png");
    private Image dice5 = new Image("file:src/main/resources/images/dices/dice5.png");
    private Image dice6 = new Image("file:src/main/resources/images/dices/dice6.png");

    Media eventCardSound = new Media(new File("src/main/resources/Gorenje.mp3").toURI().toString());
    Media quickReleseSound = new Media(new File("src/main/resources/Persona.mp3").toURI().toString());

    private ArrayList<Image> pawns = new ArrayList<>();
    private Image pawn1 = new Image("file:src/main/resources/images/pawns/pawn1.png");
    private Image pawn2 = new Image("file:src/main/resources/images/pawns/pawn2.png");
    private Image pawn3 = new Image("file:src/main/resources/images/pawns/pawn3.png");
    private Image pawn4 = new Image("file:src/main/resources/images/pawns/pawn4.png");

    @FXML
    private ImageView firstPlaceImage;
    @FXML
    private ImageView secondPlaceImage;
    @FXML
    private ImageView thirdPlaceImage;
    @FXML
    private Label firstPlaceName;
    @FXML
    private Label secondPlaceName;
    @FXML
    private Label thirdPlaceName;
    @FXML
    private TextField firstPlaceBalance;
    @FXML
    private TextField secondPlaceBalance;
    @FXML
    private TextField thirdPlaceBalance;

    public void switchToStart(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("start_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEndgame() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("endgame_scene.fxml"));
        root = loader.load();

        Controller endGameController = loader.getController();

        ArrayList<Integer> winners = playerLeaderboard();
        endGameController.setImages(pawns.get(winners.get(0) - 1), pawns.get(winners.get(1) - 1), pawns.get(winners.get(2) - 1));
        endGameController.setNames("Gracz " + winners.get(0), "Gracz " + winners.get(1), "Gracz " + winners.get(2));
        endGameController.setBalances(gameEngine.getPlayerBalance(winners.get(0)), gameEngine.getPlayerBalance(winners.get(1)), gameEngine.getPlayerBalance(winners.get(2)));

        stage = (Stage) diceImage.getScene().getWindow();
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleBuyButton(ActionEvent event) {
        messageBox.setText(gameEngine.buyField(gameEngine.getPlayerTurn()));
        updateBalance();
        showFieldBelongings();
    }
    @FXML
    private void handleSellButton(ActionEvent event) {
        if (gameEngine.getFieldOwner(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())) == gameEngine.getPlayerTurn()){
            Fields.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())).setStyle("");
            Buildings.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())).setOpacity(0);
        }
        messageBox.setText(gameEngine.sellField(gameEngine.getPlayerTurn()));
        updateBalance();
    }
    @FXML
    private void handleBuildButton(ActionEvent event) {
        if (gameEngine.isBuilt(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn()))) return;
        messageBox.setText(gameEngine.buildHouse(gameEngine.getPlayerTurn()));
        updateBalance();
        if(gameEngine.isBuilt(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn()))) {
            Buildings.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())).setOpacity(1);
        }
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

        if(soundsOn) {
            MediaPlayer mediaPlayer1 = new MediaPlayer(quickReleseSound);
            mediaPlayer1.setVolume(0.3);
            mediaPlayer1.play();
        }

        clearQuickReleaseSymbol(gameEngine.getPlayerTurn());
    }

    private void updateBalance() {
        if((gameEngine.checkPlayerLoseCondition(1))){
            Player1Balance.setText("BANKRUT");
        }else{
            Player1Balance.setText(Integer.toString(gameEngine.getPlayerBalance(1)));
        }
        if((gameEngine.checkPlayerLoseCondition(2))){
            Player2Balance.setText("BANKRUT");
        }else{
            Player2Balance.setText(Integer.toString(gameEngine.getPlayerBalance(2)));
        }
        if((gameEngine.checkPlayerLoseCondition(3))){
            Player3Balance.setText("BANKRUT");
        }else{
            Player3Balance.setText(Integer.toString(gameEngine.getPlayerBalance(3)));
        }
        if((gameEngine.checkPlayerLoseCondition(4))){
            Player4Balance.setText("BANKRUT");
        }else{
            Player4Balance.setText(Integer.toString(gameEngine.getPlayerBalance(4)));
        }
    }
    @FXML
    private void handleEndButton(ActionEvent event) throws IOException {
        eventCard.setImage(null);
        hideFieldBelongings();
        for (int i = 0; i < 4; ++i){
            if(gameEngine.getPlayerBalance(i) > gameEngine.getMaxBalance()){
                //TODO SWITCH TO END
            }
        }
        do {
            gameEngine.endTurn();
        }while (gameEngine.checkPlayerLoseCondition(gameEngine.getPlayerTurn()));

        boolean turnSkipVal = gameEngine.checkIfSkipTurn(gameEngine.getPlayerTurn());
        messageBox.setText("Teraz tura gracza: " + gameEngine.getPlayerTurn());
        showFieldBelongings();
        if(turnSkipVal){
            endButton.setDisable(false);
            rollButton.setDisable(true);
            buyButton.setDisable(true);
            buildButton.setDisable(true);
            sellButton.setDisable(true);
            messageBox.setText("Musisz czekać jeszcze: " + (gameEngine.getPlayerSkipTurn(gameEngine.getPlayerTurn())+1) + " kolejki");
            if(gameEngine.hasPlayerQuickRelese(gameEngine.getPlayerTurn())){
                quickRelese.setOpacity(1);
                quickRelese.setDisable(false);
            }
        }else {
            endButton.setDisable(true);
            rollButton.setDisable(false);
            buyButton.setDisable(true);
            buildButton.setDisable(true);
            sellButton.setDisable(true);
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
        Random rand = new Random();
        int n = rand.nextInt(1, 7);
        n = 4;

        Timeline timeline = new Timeline();
        Collection<KeyFrame> frames = timeline.getKeyFrames();
        Duration frameGap = Duration.seconds(0.2);
        Duration frameTime = Duration.ZERO;
        dices.add(dices.get(n-1));

        for (Image dice : dices) {
            frameTime = frameTime.add(frameGap);
            frames.add(new KeyFrame(frameTime, e -> diceImage.setImage(dice)));
        }

        timeline.play();
        int finalN = n;
        timeline.setOnFinished(e -> {
            dices.remove(6);

            gameEngine.movePlayer(gameEngine.getPlayerTurn(), finalN);

            int playerPosition = gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn());
            int playerMovement = gameEngine.eventFieldValidation(gameEngine.getPlayerTurn(), messageBox, eventCard, eventCardSound, soundsOn);
            if(playerMovement != playerPosition){
                movePawnToStart(gameEngine.getPlayerTurn());
                movePawn(playerMovement, gameEngine.getPlayerTurn());
            }else{
                movePawn(finalN, gameEngine.getPlayerTurn());
            }

            gameEngine.houseFieldValidation(gameEngine.getPlayerTurn(), messageBox, Fields.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())));
            gameEngine.specialFieldValidation(gameEngine.getPlayerTurn(), messageBox);
            gameEngine.setLoseCondition(gameEngine.getPlayerTurn());

            setQuickReleseSymbol(gameEngine.getPlayerTurn());
            updateBalance();

            rollButton.setDisable(true);
            endButton.setDisable(false);
            buildButton.setDisable(false);
            buyButton.setDisable(false);
            sellButton.setDisable(false);
        });
    }

    public void setQuickReleseSymbol(int playerNumber) {
        if(gameEngine.hasPlayerQuickRelese(playerNumber)) {
            quickReleaseSymbols.get(playerNumber-1).setImage(quickReleaseSymbol);
        }
    }

    public void clearQuickReleaseSymbol(int playerNumber) {
        quickReleaseSymbols.get(playerNumber-1).setImage(null);
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
            switch(gameEngine.getPlayerTurn()) {
                case 1 -> Fields.get(fieldNumber).setStyle("-fx-background-color: rgba(0,23,255,0.3); -fx-border-color: #0017ff; -fx-border-width: 4px;");
                case 2 -> Fields.get(fieldNumber).setStyle("-fx-background-color: rgba(255,24,24,0.3); -fx-border-color: #ff1818; -fx-border-width: 4px;");
                case 3 -> Fields.get(fieldNumber).setStyle("-fx-background-color: rgba(4,251,4,0.3); -fx-border-color: #04fb04; -fx-border-width: 4px;");
                case 4 -> Fields.get(fieldNumber).setStyle("-fx-background-color: rgba(255, 255, 0, 0.3); -fx-border-color: yellow; -fx-border-width: 4px;");
            }
        }
    }

    void hideFieldBelongings() {
        ArrayList<Integer> fieldBelongings = gameEngine.getFieldBelongings(gameEngine.getPlayerTurn());
        for (Integer fieldNumber: fieldBelongings) {
            Fields.get(fieldNumber).setStyle("");
        }
        Fields.get(gameEngine.getPlayerFieldIndex(gameEngine.getPlayerTurn())).setStyle("");
    }

    void createFieldsArray() {
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

    void createBuildingsArray() {
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

    void createQuickReleaseArray() {
        quickReleaseSymbols.add(quickReleaseSymbol1);
        quickReleaseSymbols.add(quickReleaseSymbol2);
        quickReleaseSymbols.add(quickReleaseSymbol3);
        quickReleaseSymbols.add(quickReleaseSymbol4);
    }

    void createDicesArray() {
        dices.add(dice1);
        dices.add(dice2);
        dices.add(dice3);
        dices.add(dice4);
        dices.add(dice5);
        dices.add(dice6);
    }

    void createPawnsArray() {
        pawns.add(pawn1);
        pawns.add(pawn2);
        pawns.add(pawn3);
        pawns.add(pawn4);
    }
}