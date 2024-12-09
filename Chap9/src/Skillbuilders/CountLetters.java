package Skillbuilders;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        final int LOW = 'A';  // Smallest possible letter value
        final int HIGH = 'Z'; // Highest possible letter value
        int[] letterCounts = new int[HIGH - LOW + 1]; // Array to count letter occurrences

        Scanner input = new Scanner(System.in);
        String phrase;
        char[] phraseLetters;
        int offset;

        // Prompt user for a phrase
        System.out.print("Enter a phrase: ");
        phrase = input.nextLine();

        // Convert phrase to uppercase and to a character array
        phrase = phrase.toUpperCase();
        phraseLetters = phrase.toCharArray();

        // Count letter occurrences, ignoring nonalphabetic characters
        for (int letter = 0; letter < phraseLetters.length; letter++) {
            if (phraseLetters[letter] >= LOW && phraseLetters[letter] <= HIGH) { // Check if it's a letter
                offset = phraseLetters[letter] - LOW;
                letterCounts[offset] += 1;
            }
        }

        // Display letter occurrences
        System.out.println("\nLetter Counts:");
        for (int i = LOW; i <= HIGH; i++) {
            if (letterCounts[i - LOW] > 0) { // Show only letters that occur
                System.out.println((char) i + ": " + letterCounts[i - LOW]);
            }
        }

        input.close();
    }
}
