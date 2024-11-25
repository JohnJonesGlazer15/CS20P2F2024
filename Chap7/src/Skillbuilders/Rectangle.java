package Skillbuilders;

public class Rectangle {
    private double length;
    private double width;

    // Default constructor (no parameters)
    public Rectangle() {
        this.length = 0.0; // Default length
        this.width = 0.0;  // Default width
    }

    // Overloaded constructor with two parameters (length and width)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
