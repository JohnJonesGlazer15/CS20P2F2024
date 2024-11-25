package Skillbuilders;

class Circle {
    private double radius;

    // Constructor
    public Circle() {
        this.radius = 0.0; // Default radius
    }

    // Setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
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

	public static void displayAreaFormula() {
		// TODO Auto-generated method stub
		
	}
}
