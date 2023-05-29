package src;

public class EventField extends Field {
    private int stayingTurns;
    private int travelTargetIndex;
    private int ammountOfFieldsToGo;
    private boolean isSaveable;


    public EventField(String fieldName) {
        this.fieldName = fieldName;
        this.canBuy = false;
        this.fieldType = FieldTypes.EVENTFIELD;
    }
    //    private boolean isEvent;

    //Field only for picking up events cards

}