package src;

class EventType{
    public final int moveEvent=1;
    public final int payEvent=2;
    public final int turnEvent=3;
}
public class Event {
    private String name;
    private EventType eventType;
    private int toPay;
    private int fieldIndex;
    private int turnSkipAmount;


    public String getName() {
        return name;
    }
}
