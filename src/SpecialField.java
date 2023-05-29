package src;

public class SpecialField extends Field{
    private Event eventCard;
    private int stayingTurnAmount;
    private int amountOfFieldsBougthByPlayer;
    private int belongToPlayerNumber;
    //tu można zrobić tak że jaeśli pole daje pieniądze czyli konkurs WRS to po ptostu na minos jak tam na innym polu dałaś



    public SpecialField(String fieldName, int defaultCost, boolean canBuy){
        this.fieldName = fieldName;
        this.defaultCost = defaultCost;
        this.canBuy = canBuy; //tak bo są te pola odpowiedniki "Akcja" z biznes po europejsku więc to ma sens
        this.fieldType = FieldTypes.SPECIALFIELD;
    }
    public void setEventCard(String name, Enum<EventType> eventType, int toPay, int fieldIndex, int deltaFieldIndex, int turnSkipAmount) {
        this.eventCard = new Event(name, eventType, toPay, fieldIndex, deltaFieldIndex, turnSkipAmount);
    }
    //corners and special fields (ex. "Dzień wydziału", "Dante")

    //Pola ForcePay
    //pola GoDante
    //pole więzienie
    //pole Konkurs
    //pole akcji
}
