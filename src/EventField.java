package src;

public class EventField extends Field{
    public EventField(String fieldName, int defaultCost){
        this.fieldName = fieldName;
        this.defaultCost = defaultCost;
        this.canBuy = false;
        this.fieldType = FieldTypes.EVENTFIELD;
    }
    //    private boolean isEvent;

    //Field only for picking up events cards

    //Pola ForcePay
    //pola GoDante
    //pole więzienie
    //pole Konkurs
    //pole akcji
}
