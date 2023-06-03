package com.example.monopol;

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
//        Collections.shuffle(events);
    }

    public int setFieldOwner(int fieldIndex, int playerNumber){
        if(fields.get(fieldIndex).getFieldType() == FieldTypes.HOUSEFIELD){
            HouseField tmp =  (HouseField) fields.get(fieldIndex);
            if(tmp.availableField()){
                tmp.setBelongToPlayerNumber(playerNumber);
                return 0;
            }
            return 1;
        }
        return -1;
    }

    public String getFieldName(int fieldIndex){
        return fields.get(fieldIndex).getFieldName();
    }
    public int getFieldPrice(int fieldIndex){
        return fields.get(fieldIndex).getDefaultCost();
    }
    public int getFieldOwner(int fieldIndex){
        if(fields.get(fieldIndex).getFieldType() == FieldTypes.HOUSEFIELD){
            HouseField houseField = (HouseField) fields.get(fieldIndex);
            return houseField.getFieldOwner();
        }
        return -1;
    }
    public int getStayingCost(int fieldIndex){
        if(fields.get(fieldIndex).getFieldType() == FieldTypes.HOUSEFIELD){
            HouseField houseField = (HouseField) fields.get(fieldIndex);
            return houseField.getStayingCost();
        }
        return 0;
    }
    public Enum<FieldTypes> getFieldType(int fieldIndex){
        Field field = fields.get(fieldIndex);
        return field.getFieldType();
    }
    public Event drawEventCard(){
        Event event = events.get(0);
        events.remove(0);
        return event;
    }

}
