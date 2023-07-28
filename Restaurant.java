
//private modifier private is one specifies that the member can only be accessed in its own class.
//public class that can be accessed from anywhere inside the program.
//protected modifier is one that modifier specifies that the member can only be accessed within its own package


import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String ratings;
    private double prices;
    private List<String> menuItems;

    public Restaurant(String ratings, double prices) {
        this.ratings = ratings;
        this.prices = prices;
        this.menuItems = new ArrayList<>();
    }


    public void add menuItems(String menuItems) {
        menuItems.add(menuItems);
    }

    public void removemenuItems(String menuItems) {
        menuItems.remove(menuItems);
    }


    public void printCourses() {
        if (menuItems.isEmpty()) {
            System.out.println("No menu items " + ratings);
        } else {
            System.out.println("menuitems " + ratings + ":");
            for (String course : menuItems) {
                System.out.println(course);
            }
        }
    }

    public static void main(String[] args) {

        Restaurant Restaurant1 = new Restaurant("hungry house",10300);
        Restaurant1.add menuItems("pizza");
        Restaurant1.add menuItems("refreshments");
        Restaurant1.add menuItems("deserts");


        Restaurant1.printmenuItems();


        student1.removemenuItems("Java");

        student1.printmenuItems();
    }
}

