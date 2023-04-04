package restaurant;

import java.util.ArrayList;
import java.util.Date;

//test commit for git bash testing
public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
    }

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
}
