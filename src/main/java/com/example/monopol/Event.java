package com.example.monopol;

import javafx.scene.image.Image;

enum EventType {
    MOVEEVENT,
    PAYEVENT,
    TURNEVENT,
    QUICKRELESEEVENT
}

public class Event {
    private String name;
    private Enum<EventType> eventType;
    private int toPay;
    private int fieldIndex;
    private int deltaFieldIndex;
    private int turnSkipAmount;
    private Image eventCardImage;

    public Event(String name, Enum<EventType> eventType, int toPay, int fieldIndex, int deltaFieldIndex, int turnSkipAmount, String eventCardImagePath) {
        this.name = name;
        this.eventType = eventType;
        this.toPay = toPay;
        this.fieldIndex = fieldIndex;
        this.deltaFieldIndex = deltaFieldIndex;
        this.turnSkipAmount = turnSkipAmount;
        this.eventCardImage = new Image(eventCardImagePath);
    }


    public String getName() {
        return name;
    }
    public Enum<EventType> getEventType(){
        return eventType;
    }
    public int getFieldIndex(){
        return fieldIndex;
    }
    public int getDeltaFieldIndex(){
        return deltaFieldIndex;
    }
    public int getToPay(){
        return toPay;
    }
    public int getTurnSkipAmount(){
        return turnSkipAmount;
    }
    public Image getEventCardImage() {
        return eventCardImage;
    }
}
