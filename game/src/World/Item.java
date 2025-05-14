package World;

public class Item {
    private String itemName;
    private String itemDescription;
    private String itemType;
    private Integer itemValue;

    public Item(String itemName, String itemDescription, String itemType, Integer itemValue) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.itemValue = itemValue;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getItemValue() {
        return itemValue;
    }

    public void setItemValue(Integer itemValue) {
        this.itemValue = itemValue;
    }
<<<<<<< HEAD
    


Item shield = new Item("Shield", "A sturdy shield", "Armor", 0);
System.out.println("Item Name: " + sword.getName());
System.out.prDescription: " + sword.getDescription());
System.out.println("Item Type: " + sword.getType());
System.out.println("Item Health: " + sword.getHealth());


System.out.println("Item Name: " + potion.getName());
System.out.println("Item Description: " + potion.getDescription()); intln("Item 
=======
>>>>>>> 3ba3d7ddc484a580c7f89548bac1b7ea80e9a78a
}

