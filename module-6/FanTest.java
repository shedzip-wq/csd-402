/*
	* Author: Sheridan Dela Cruz
	* Date: June 27, 2026
	* Module 6.2
	* Description: Creates Fan objects and tests their methods by displaying and modifying their state.
 */
 
 public class FanTest {
    public static void main(String[] args) {

        // Fan using default constructor
        Fan defaultFan = new Fan();

        // Fan using argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        // Display both fans
        System.out.println("Default Fan: " + defaultFan);
        System.out.println("Custom Fan: " + customFan);

        // Demonstrate setters
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setColor("red");

        System.out.println("Updated Default Fan: " + defaultFan);
    }
}
