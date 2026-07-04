/*
	* Author: Sheridan Dela Cruz
	* Date: July 3, 2026
	* Module 7.2
	* The UseFans class demonstrates how to create and work with a collection of Fan objects. It includes methods for displaying
    * individual fans and collections of fans without relying on the Fan class's toString() method.
 */
 
import java.util.ArrayList;
import java.util.Collection;
 
public class UseFans {

    /**
     * Displays the details of a single Fan instance without using toString().
     *
     * @param fan the Fan object to display
     */
    public static void displayFan(Fan fan) {
        System.out.println("Fan:");
        System.out.println("  Speed: " + fan.getSpeed());
        System.out.println("  On: " + fan.isOn());
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
        System.out.println();
    }

    /**
     * Displays all Fan objects in a given collection.
     * This method calls displayFan() for each Fan.
     *
     * @param fans a collection of Fan instances
     */
    public static void displayFans(Collection<Fan> fans) {
        System.out.println("Displaying all fans:");
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    /**
     * Main method demonstrating the creation of Fan objects,
     * storing them in a collection, and displaying their properties.
     *
     * This serves as the test code for verifying functionality.
     */
    public static void main(String[] args) {

        // Create a collection of Fan instances
        ArrayList<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan(Fan.FAST, true, 10.0, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 6.0, "blue");
        Fan fan3 = new Fan(Fan.SLOW, true, 8.0, "green");

        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display all fans
        displayFans(fanList);

        // Display a single fan
        System.out.println("Displaying a single fan:");
        displayFan(fan2);
    }
}
