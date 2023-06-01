package com.example.monopol;

import java.util.ArrayList;

public class Player {
    private int playerNumber;
    private int playerBalance;
    private int fieldNumber;
    private ArrayList<Integer> fieldBelongings;
    private ArrayList<Event> eventHand;

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.playerBalance = 2200;
        this.fieldNumber = 0;
        this.fieldBelongings = new ArrayList<>();
        this.eventHand = new ArrayList<>();
    }

    public int getPlayerBalance() {
        return playerBalance;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public ArrayList<Integer> getFieldBelongings() {
        return fieldBelongings;
    }

    public void setFieldNumber(int fieldNumber){
        this.fieldNumber = fieldNumber;
    }

    public void setPlayerBalance(int playerBalance) {
        this.playerBalance = playerBalance;
    }

    public void addFieldCard(int fieldIndex){
        fieldBelongings.add(fieldIndex);
    }
}
