package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class GameEngine {
    private final Board board;

    //todo maxFieldNumber
    private final int maxFieldNumber = 36;
    private final int minFieldNumber = 0;
    private TreeMap<Integer, Player> players;
    private static int playerNumber = 0;
    public GameEngine(int playerAmount){
        this.board = new Board();
        this.players = new TreeMap<>();

        for(int i = 0; i < playerAmount; ++i){
            playerNumber++;
            Player newPlayer = new Player(playerNumber);
            players.put(playerNumber, newPlayer);
        }
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
    }

    public void editPlayerBalance(int playerNumber, int delta){
        Player player = players.get(playerNumber);
        int currentBalance = player.getPlayerBalance();
        player.setPlayerBalance(currentBalance+delta);
    }

}
