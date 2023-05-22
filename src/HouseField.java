package src;

public class HouseField extends Field{
    private int oneBuildingCost;
    private int stayingCost;
    private int belongToPlayerNumber;

    public HouseField(String fieldName, int defaultCost, int oneBuildingCost, int stayingCost){
        this.fieldName = fieldName;
        this.defaultCost = defaultCost;
        this.canBuy = true;
        this.oneBuildingCost = oneBuildingCost;
        this.stayingCost = stayingCost;
        this.belongToPlayerNumber = 0;
    }

}

