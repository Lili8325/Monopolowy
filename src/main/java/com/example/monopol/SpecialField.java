package com.example.monopol;

public class SpecialField extends Field{
    private Event eventCard;

    public SpecialField(String fieldName, int defaultCost, boolean canBuy){
        this.fieldName = fieldName;
        this.defaultCost = defaultCost;
        this.canBuy = canBuy;
        this.fieldType = FieldTypes.SPECIALFIELD;
        this.eventCard = null;
    }
    public void setEventCard(String name, Enum<EventType> eventType, int toPay, int fieldIndex, int deltaFieldIndex, int turnSkipAmount, String eventCardImagePath) {
        this.eventCard = new Event(name, eventType, toPay, fieldIndex, deltaFieldIndex, turnSkipAmount, eventCardImagePath);
    }
    public Event getEventCard(){
        return eventCard;
    }
}
