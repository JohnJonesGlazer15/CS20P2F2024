package Mastery;

class PiggyBank {
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    // Constructor
    public PiggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    // Add coins
    public void addPenny() {
        pennies++;
    }

    public void addNickel() {
        nickels++;
    }

    public void addDime() {
        dimes++;
    }

    public void addQuarter() {
        quarters++;
    }

    // Calculate total amount in the piggy bank
    public double getTotalAmount() {
        return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
    }

    // Remove all money from the piggy bank
    public double takeMoneyOut() {
        double total = getTotalAmount();
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
        return total;
    }
}

