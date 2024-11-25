package Mastery;

public class Num {
    private int number;

    // Constructor
    public Num(int number) {
        this.number = number;
    }

    // Method to get the whole number
    public int getWholeNumber() {
        return number;
    }

    // Method to get the ones digit
    public int getOnesDigit() {
        return Math.abs(number % 10);
    }

    // Method to get the tens digit
    public int getTensDigit() {
        return Math.abs((number / 10) % 10);
    }

    // Method to get the hundreds digit
    public int getHundredsDigit() {
        return Math.abs((number / 100) % 10);
    }
}