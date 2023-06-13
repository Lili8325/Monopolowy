package com.example.monopol;

public class HouseField extends Field{
    private int oneBuildingCost;
    private int stayingCost;
    private int belongToPlayerNumber;
    private boolean houseBuilt;

    public HouseField(String fieldName, int defaultCost, int oneBuildingCost, int stayingCost){
        this.fieldName = fieldName;
        this.defaultCost = defaultCost;
        this.canBuy = true;
        this.oneBuildingCost = oneBuildingCost;
        this.stayingCost = stayingCost;
        this.belongToPlayerNumber = -1;
        this.fieldType = FieldTypes.HOUSEFIELD;
        this.houseBuilt = false;
    }

    public void setBelongToPlayerNumber(int playerNumber){
        this.belongToPlayerNumber = playerNumber;
    }

    public boolean availableField(){
        return belongToPlayerNumber == -1;
    }

    public int getFieldOwner(){
        return belongToPlayerNumber;
    }

    public int getStayingCost() {
        return stayingCost;
    }

    public int getOneBuildingCost(){
        return oneBuildingCost;
    }

    public void setHouseBuilt(boolean val){
        this.houseBuilt = val;
    }
    public boolean getHouseBuilt(){
        return houseBuilt;
    }
}

