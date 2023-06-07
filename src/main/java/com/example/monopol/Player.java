package com.example.monopol;

import java.util.ArrayList;

public class Player {
    private int playerNumber;
    private int playerBalance;
    private int fieldNumber;
    private int turnsToSkip;
    private ArrayList<Integer> fieldBelongings;
    private boolean quickRelese;

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.playerBalance = 2200;
        this.fieldNumber = 0;
        this.turnsToSkip = 0;
        this.fieldBelongings = new ArrayList<>();
        this.quickRelese = false;
    }

    public int getPlayerBalance() {
        return playerBalance;
    }
    public int getFieldNumber() {
        return fieldNumber;
    }
    public int getTurnsToSkip() {
        return turnsToSkip;
    }

    public ArrayList<Integer> getFieldBelongings() {
        return fieldBelongings;
    }

    public void setFieldNumber(int fieldNumber){
        this.fieldNumber = fieldNumber;
    }

    public void setTurnsToSkip(int turnsToSkip){
        this.turnsToSkip = turnsToSkip;
    }

    public void setPlayerBalance(int playerBalance) {
        this.playerBalance = playerBalance;
    }

    public void addFieldCard(int fieldIndex){
        fieldBelongings.add(fieldIndex);
    }
    public void removeFieldCard(int fieldIndex){
        fieldBelongings.remove(Integer.valueOf(fieldIndex));
    }
    public boolean isQuickRelese(){
        return quickRelese;
    }
    public void setQuickRelese(boolean val){
        this.quickRelese = val;
    }
}
