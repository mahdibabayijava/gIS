public abstract class Item {
    //--------------------------Fields-------------------------
    protected String itemID;
    protected String itemName;


    //-----------------------Constructors----------------------
    public Item(String itemID, String itemName) {
        setItemID(itemID);
        setItemName(itemName);
    }


    //-------------------------Setters-------------------------
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    //-------------------------Getters-------------------------
    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }


    //-------------------------Methods-------------------------
}
