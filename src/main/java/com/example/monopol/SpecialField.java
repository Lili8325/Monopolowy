package com.example.monopol;

public class SpecialField extends Field{
    private Event eventCard;

    public SpecialField(String fieldName, int defaultCost, boolean canBuy){
        this.fieldName = fieldName;
        this.defaultCost = defaultCost;
        this.canBuy = canBuy; //maybe???
        this.fieldType = FieldTypes.SPECIALFIELD;
        this.eventCard = null;
    }
    public void setEventCard(String name, Enum<EventType> eventType, int toPay, int fieldIndex, int deltaFieldIndex, int turnSkipAmount) {
        this.eventCard = new Event(name, eventType, toPay, fieldIndex, deltaFieldIndex, turnSkipAmount);
    }
    public Event getEventCard(){
        return eventCard;
    }

    //corners and special fields (ex. "Dzień wydziału", "Dante")
    //Pola ForcePay
    //pola GoDante
    //pole więzienie
    //pole Konkurs
    //pole akcji
}
