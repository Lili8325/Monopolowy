package com.example.monopol;

import javafx.scene.image.Image;

enum EventType {
    MOVEEVENT,
    PAYEVENT,
    TURNEVENT,
    QUICKRELESEEVENT
}

public class Event {
    private final String name;
    private final Enum<EventType> eventType;
    private final int toPay;
    private final int fieldIndex;
    private final int deltaFieldIndex;
    private final int turnSkipAmount;
    private final Image eventCardImage;

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
