package com.example.monopol;

public class EventField extends Field {
    public EventField(String fieldName) {
        this.fieldName = fieldName;
        this.canBuy = false;
        this.fieldType = FieldTypes.EVENTFIELD;
    }
}