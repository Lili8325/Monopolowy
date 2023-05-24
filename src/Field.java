package src;

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
}

