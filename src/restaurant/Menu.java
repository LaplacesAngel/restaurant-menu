package restaurant;

import java.util.ArrayList;
import java.util.Date;

//test commit for git bash testing
public class Menu {
    //class variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;
    //constructors
    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public Menu() {
        this.lastUpdated = new Date();
    }
    //methods
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }



    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    //methods
    //add a way to add and remove items from the menu
    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.lastUpdated = new Date();
        this.menuItems.remove(menuItem);
    }

    public void printFullMenu(){
        this.menuItems.forEach(menuItem -> System.out.println(menuItem.toString()));
    }
}
