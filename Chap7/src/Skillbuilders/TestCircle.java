package Skillbuilders;
public class TestCircle {
    public static void main(String[] args) {
        Circle spot = new Circle(); // Create a Circle object
        spot.setRadius(5); // Set the radius of the circle

        System.out.println("Circle radius: " + spot.getRadius()); // Correctly call getRadius()
        System.out.println("Circle area: " + spot.getArea()); // Use a proper area method
        System.out.println("Circle circumference: " + spot.circumference()); // New circumference method
    }
}