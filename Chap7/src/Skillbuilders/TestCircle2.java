package Skillbuilders;
public class TestCircle2 {
	    public static void main(String[] args) {
	        // Using the default constructor
	        Circle spot = new Circle(); // Default constructor
	        spot.setRadius(5); // Set radius using setter
	        System.out.println("Using default constructor:");
	        System.out.println("Circle radius: " + spot.getRadius());
	        System.out.println("Circle area: " + spot.getArea());
	        System.out.println("Circle circumference: " + spot.circumference());

	        // Using the overloaded constructor
	        Circle circleWithRadius = new Circle(); // Overloaded constructor
	        System.out.println("\nUsing overloaded constructor:");
	        System.out.println("Circle radius: " + circleWithRadius.getRadius());
	        System.out.println("Circle area: " + circleWithRadius.getArea());
	        System.out.println("Circle circumference: " + circleWithRadius.circumference());
	    }
	}
