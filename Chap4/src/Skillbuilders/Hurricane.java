package Skillbuilders;

import java.util.Scanner;

public class Hurricane 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the category of your hurricane: ");
        double categoryInput = scanner.nextDouble();
        int category = (int) Math.round(categoryInput);

        if (category <= 1) {
            System.out.println("Category 1: 74-95 mph, 64-82 kt, or 119-153 km/h");
        } else if (category == 2) {
            System.out.println("Category 2: 96-110 mph, 83-95 kt, or 154-177 km/h");
        } else if (category == 3) {
            	System.out.println("Category 3: 111-130 mph, 96-113 kt, or 178-209 km/h");
        } else if (category == 4) {
        	System.out.println("Category 4: 131-155 mph, 114-135 kt, or 210-249 km/h");
        } else if (category == 5) {
        	System.out.println("Category 5: #>155 mph, 135 kt, or 249 km/h");
        } else {
            System.out.println("Category " + category + ": Higher category, please check official guidelines.");
        }
    }
}