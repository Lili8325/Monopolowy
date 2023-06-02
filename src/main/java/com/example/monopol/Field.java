package com.example.monopol;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

enum FieldTypes {
    HOUSEFIELD,
    EVENTFIELD,
    SPECIALFIELD
}

abstract public class Field {
    protected String fieldName;
    protected Enum<FieldTypes> fieldType;
    protected int defaultCost;
    protected boolean canBuy;

    public Enum<FieldTypes> getFieldType() {
        return fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public int getDefaultCost() {
        return defaultCost;
    }

    public boolean isCanBuy() {
        return canBuy;
    }

}

