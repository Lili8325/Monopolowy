package src;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
    private ArrayList<Field> fields;
    private ArrayList<Event> events;
    private int playerAmount;

    Board(int playerAmount){
        fields = new ArrayList<>();
        BoardBuilder.createFields(fields);

        events = new ArrayList<>();
        BoardBuilder.createEventCards(events);
        Collections.shuffle(events);

        this.playerAmount = playerAmount;
    }
}
