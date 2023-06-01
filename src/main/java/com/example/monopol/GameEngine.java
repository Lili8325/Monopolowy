package com.example.monopol;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class GameEngine {
    private final Board board;
    private final int maxFieldNumber = 40;
    private final int minFieldNumber = 0;
    private TreeMap<Integer, Player> players;
    private int playerNumber = 0;
    private int playerTurn = 1;

    public GameEngine(int playerAmount){
        this.board = new Board();
        this.players = new TreeMap<>();

        for(int i = 0; i < playerAmount; ++i){
            playerNumber++;
            Player newPlayer = new Player(playerNumber);
            players.put(playerNumber, newPlayer);
        }
    }
    public int getPlayerTurn() {
        return playerTurn;
    }
    public int playerTurn() {
        return playerTurn;
    }
    public int getMoveNumber(){
        return ThreadLocalRandom.current().nextInt(1, 7);
    }
    public void movePlayer(int playerNumber, int moveNumber){
        Player player = players.get(playerNumber);
        int currentField = player.getFieldNumber();
        if(currentField+moveNumber > maxFieldNumber){
            int remainMove = (currentField+moveNumber) - maxFieldNumber;
            player.setFieldNumber(remainMove);
            editPlayerBalance(playerNumber, 200);
        }else{
            player.setFieldNumber(currentField+moveNumber);
        }
//        Enum<FieldTypes> fieldType = board.getFieldType(currentField);
//        if(fieldType == FieldTypes.EVENTFIELD){
//            return executeEventCard(playerNumber);
//        }
//        return "n";
    }

    public void editPlayerBalance(int playerNumber, int delta){
        Player player = players.get(playerNumber);
        int currentBalance = player.getPlayerBalance();
        player.setPlayerBalance(currentBalance+delta);
    }

    public void endTurn(){
        if(playerTurn >= 4){
            playerTurn = 1;
        }else{
            playerTurn += 1;
        }
    }

    public String buyField(int buyerPlayerNumber){
        Player player = players.get(buyerPlayerNumber);
        int playerFieldNumber = player.getFieldNumber();
        int value = board.setFieldOwner(playerFieldNumber, buyerPlayerNumber);
        if(value == 0){
            player.addFieldCard(playerFieldNumber);
            return "Field " + board.getFieldName(playerFieldNumber) + " belongs now to player: " + buyerPlayerNumber;
        }else if(value == 1) {
            return "Field " + board.getFieldName(playerFieldNumber) + " is occupied by player: " + board.getFieldOwner(playerFieldNumber);
        }
        return "Can't buy field: " + board.getFieldName(playerFieldNumber);
    }

    public String getFieldName(int playerNumber){
        Player player = players.get(playerNumber);
        return board.getFieldName(player.getFieldNumber());
    }

    public int getPlayerBalance(int playerNumber){
        Player player = players.get(playerNumber);
        return player.getPlayerBalance();
    }

    public ArrayList<Integer> getFieldBelongings(int playerNumber) {
        Player player = players.get(playerNumber);
        return player.getFieldBelongings();
    }

    public String executeEventCard(int playerNumber){
        Player player = players.get(playerNumber);
        Event event = board.drawEventCard();
        Enum<EventType> type = event.getEventType();
        if(type == EventType.MOVEEVENT){
            if(event.getDeltaFieldIndex() == 0){
                player.setFieldNumber(player.getFieldNumber() + event.getDeltaFieldIndex());
            }else{
                player.setFieldNumber(event.getFieldIndex());
            }
        } else if (type == EventType.PAYEVENT) {
            player.setPlayerBalance(player.getPlayerBalance() - event.getToPay());
        }else if (type == EventType.TURNEVENT) {
            //todo placeholder
        }
        return event.getName();
    }

//    public static void main(String[] args) {
//        GameEngine tmp = new GameEngine(4);
//        tmp.movePlayer(1, 1);
//        System.out.println(tmp.buyField(1));
//    }

}
