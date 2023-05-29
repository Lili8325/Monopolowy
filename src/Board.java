package src;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
    private ArrayList<Field> fields;
    private ArrayList<Event> events;
    public Board(){
        fields = new ArrayList<>();
        BoardBuilder.createFields(fields);

        events = new ArrayList<>();
        BoardBuilder.createEventCards(events);
        Collections.shuffle(events);
    }

    public int setFieldOwner(int fieldIndex, int playerNumber){
        if(fields.get(fieldIndex).getFieldType() == FieldTypes.HOUSEFIELD){
            HouseField tmp =  (HouseField) fields.get(fieldIndex);
            if(tmp.availableField()){
                tmp.setBelongToPlayerNumber(playerNumber);
                return 0;
            }
            return 1;
        }return -1;
    }

    public String getFieldName(int fieldIndex){
        return fields.get(fieldIndex).getFieldName();
    }
}
