import restaurant.Menu;
import restaurant.MenuItem;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        MenuItem eggs = new MenuItem("eggs", "scrambled eggs", 5, "protein", true);
        MenuItem pancake = new MenuItem("pancake", "you already know", 5, "carbs", true);
        MenuItem bacon = new MenuItem("bacon", "fried pork flesh", 10, "protein", true);

        bacon.setItemName("Bakieboie");
        pancake.setDescription("Fluffy nice flour circles");

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(eggs);
        menuItems.add(pancake);
        menuItems.add(bacon);

        Menu breakfast = new Menu();

        System.out.println(eggs);
        System.out.println(eggs.toString());
        System.out.println("Are eggs equal to pancakes? " + eggs.equals(pancake));
        System.out.println("Is eggs new? " +eggs.isNew());
        System.out.println(eggs.equals(eggs));
        System.out.println("Breakfast: " + breakfast);

        breakfast.removeMenuItem(eggs);
        System.out.println("Eggs removed: " + breakfast.toString());

        breakfast.addMenuItem(eggs);
        System.out.println("Eggs added back" + breakfast);
        breakfast.addMenuItem(pancake);
        breakfast.addMenuItem(bacon);

        System.out.println(breakfast);

        System.out.println(menuItems.size());
        breakfast.printFullMenu();



    }
}