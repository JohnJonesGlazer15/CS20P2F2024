package Skillbuilders;

public class Circle2 {
    private double radius;

    // Default constructor
    public Circle2() {
        this.radius = 0.0; // Default radius
    }

    // Overloaded constructor
    public Circle2(double radius) {
        this.radius = radius; // Set radius using parameter
    }

    // Setter method (modifier method)
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method (accessor method)
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

