package Mastery;

public class Food {
    private double price;
    private double fat;
    private double carbs;
    private double fiber;

    public Food(double price, double fat, double carbs, double fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    public double getPrice() {
        return price;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFiber() {
        return fiber;
    }
}
