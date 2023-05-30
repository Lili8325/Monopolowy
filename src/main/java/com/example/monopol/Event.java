package com.example.monopol;
enum EventType {
    MOVEEVENT,
    PAYEVENT,
    TURNEVENT
}

public class Event {
    private String name;
    private Enum<EventType> eventType;
    private int toPay;
    private int fieldIndex;
    private int deltaFieldIndex;
    private int turnSkipAmount;

    public Event(String name, Enum<EventType> eventType, int toPay, int fieldIndex, int deltaFieldIndex, int turnSkipAmount) {
        this.name = name;
        this.eventType = eventType;
        this.toPay = toPay;
        this.fieldIndex = fieldIndex;
        this.deltaFieldIndex = deltaFieldIndex;
        this.turnSkipAmount = turnSkipAmount;
    }


    public String getName() {
        return name;
    }
}
