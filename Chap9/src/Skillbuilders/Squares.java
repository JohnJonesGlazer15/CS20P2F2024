package Skillbuilders;

public class Squares {
    public static void main(String[] args) {
        int[] squares = new int[5];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }

        System.out.println("Squares of Indices:");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Index " + i + ": " + squares[i]);
        }
    }
}