package Skillbuilders;

public class TestRectangle {
    public static void main(String[] args) {
        // Using the default constructor
        Rectangle defaultRectangle = new Rectangle(); // Default constructor
        defaultRectangle.setLength(5); // Set length
        defaultRectangle.setWidth(3);  // Set width
        System.out.println("Using default constructor:");
        System.out.println("Rectangle length: " + defaultRectangle.getLength());
        System.out.println("Rectangle width: " + defaultRectangle.getWidth());
        System.out.println("Rectangle area: " + defaultRectangle.getArea());
        System.out.println("Rectangle perimeter: " + defaultRectangle.getPerimeter());

        // Using the overloaded constructor
        Rectangle customRectangle = new Rectangle(7, 4); // Overloaded constructor
        System.out.println("\nUsing overloaded constructor:");
        System.out.println("Rectangle length: " + customRectangle.getLength());
        System.out.println("Rectangle width: " + customRectangle.getWidth());
        System.out.println("Rectangle area: " + customRectangle.getArea());
        System.out.println("Rectangle perimeter: " + customRectangle.getPerimeter());
    }
}
