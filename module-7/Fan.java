/*
	* Author: Sheridan Dela Cruz
	* Date: July 3, 2026
	* Module 7.2
	* Description: Defines a Fan class with speed settings, on/off state, radius, and color. 
	* Includes constructors, getters/setters, and a toString method.
 */
 
public class Fan {

    /** Constant representing a stopped fan (speed = 0). */
    public static final int STOPPED = 0;

    /** Constant representing slow speed. */
    public static final int SLOW = 1;

    /** Constant representing medium speed. */
    public static final int MEDIUM = 2;

    /** Constant representing fast speed. */
    public static final int FAST = 3;

    /** Current speed of the fan. */
    private int speed = STOPPED;

    /** Indicates whether the fan is turned on. */
    private boolean on = false;

    /** Radius of the fan in inches. */
    private double radius = 6;

    /** Color of the fan. */
    private String color = "white";

    /**
     * Default constructor that initializes the fan with default values:
     * STOPPED speed, off state, radius of 6, and white color.
     */
    public Fan() {
        // Default values already assigned above
    }

    /**
     * Constructs a Fan with the specified speed, power state, radius, and color.
     *
     * @param speed  the speed setting of the fan
     * @param on     whether the fan is turned on
     * @param radius the radius of the fan
     * @param color  the color of the fan
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /** @return the current speed of the fan */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Sets the speed of the fan.
     *
     * @param speed the new speed setting
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /** @return true if the fan is on, false otherwise */
    public boolean isOn() {
        return this.on;
    }

    /**
     * Sets the power state of the fan.
     *
     * @param on true to turn the fan on, false to turn it off
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /** @return the radius of the fan */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Sets the radius of the fan.
     *
     * @param radius the new radius value
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** @return the color of the fan */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color of the fan.
     *
     * @param color the new color value
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a string describing the fan's current state.
     *
     * @return a formatted string containing fan properties
     */
    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + this.speed +
                ", on=" + this.on +
                ", radius=" + this.radius +
                ", color='" + this.color + '\'' +
                '}';
    }
}
