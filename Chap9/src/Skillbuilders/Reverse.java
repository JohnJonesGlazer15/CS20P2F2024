package Skillbuilders;

public class Reverse {
    public static void main(String[] args) {
        int[] countdown = new int[10];

        // Fill the array with numbers corresponding to the index
        for (int i = 0; i < countdown.length; i++) {
            countdown[i] = i;
        }

        System.out.println("Countdown:");
        // Display the array in reverse order
        for (int i = countdown.length - 1; i >= 0; i--) {
            System.out.println(countdown[i]);
        }
    }
}