/*
	* Author: Sheridan Dela Cruz
	* Date: July 15, 2026
	* Module 9.2
	* Desciption: A simple coffee menu that prints drinks, lets the user pick one by index, and safely handles invalid input.
 */
 
import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        // Create ArrayList with at least 10 Strings
        ArrayList<String> items = new ArrayList<>();
		items.add("Caramel Cloud Macchiato");
		items.add("Iced Honey Cinnamon Latte");
		items.add("Mocha Mint Swirl");
		items.add("Vanilla Cold Brew Float");
		items.add("Hazelnut Crunch Cappuccino");
		items.add("Maple Brown Sugar Latte");
		items.add("Coconut Mocha Breeze");
		items.add("Spiced Cardamom Espresso");
		items.add("Toffee Nut Cortado");
		items.add("Strawberry Sweet Cream Latte");

        // Print using for-each loop
        System.out.println("Here are the items in the list:");
        for (String item : items) {
            System.out.println(item);
        }

        // Ask user which element they want to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the item you want to see again: ");
        String userInput = scanner.nextLine();  // user enters a String

        // Autoboxing/Unboxing occurs here:
        // Integer.valueOf(userInput) creates an Integer object (autoboxing)
        // int index = Integer.valueOf(userInput) converts Integer → int (unboxing)
        try {
            int index = Integer.valueOf(userInput);  
            System.out.println("You selected: " + items.get(index));
        } catch (Exception e) {
            System.out.println("Exception thrown: Out of Bounds");
        }
    }
}
