package restaurant;

import java.util.Calendar;


public class MenuItem {
    private String itemName;
    private String description;
    private int price;
    private String category;
    private boolean newItem;


    public MenuItem(String itemName, String description, int price, String category, boolean newItem) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.category = category;
        this.newItem = newItem;
    }

    public MenuItem (String itemName, String description, int price){
        this(itemName, description, price, "MISC", false);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

}
