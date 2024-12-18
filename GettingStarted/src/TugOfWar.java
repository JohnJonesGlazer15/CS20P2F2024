/*
Program: TugOfWar.java          Last Date of this Revision: December 17th, 2024

Purpose: An application that counts the number of times a player presses a button and whichever gets to 10 is the winner

Author: Malik Muhieddine
School: CHHS
Course: Computer Programming 20
*/

// Add Phidgets Library
import com.phidget22.*;

public class TugOfWar {
    public static void main(String[] args) throws Exception {
        // Create objects for your buttons and LEDs
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        // Address the buttons and LEDs
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Open connections
        redButton.open(1000);
        greenButton.open(1000);
        redLED.open(1000);
        greenLED.open(1000);

        // Initialize counters and previous states
        int redButtonPressCount = 0;
        int greenButtonPressCount = 0;

        boolean redButtonPreviousState = redButton.getState();
        boolean greenButtonPreviousState = greenButton.getState();
        boolean gameOver = false; // Flag to indicate game end

        // Main loop
        while (true) {
            // Get current states
            boolean redButtonCurrentState = redButton.getState();
            boolean greenButtonCurrentState = greenButton.getState();

            // Check for red button press (false -> true)
            if (redButtonCurrentState && !redButtonPreviousState) {
                redButtonPressCount++;
                System.out.println("Red Button Press Count: " + redButtonPressCount);
            }
            redButtonPreviousState = redButtonCurrentState;

            // Check for green button press (false -> true)
            if (greenButtonCurrentState && !greenButtonPreviousState) {
                greenButtonPressCount++;
                System.out.println("Green Button Press Count: " + greenButtonPressCount);
            }
            greenButtonPreviousState = greenButtonCurrentState;

            // Check if either player has won
            if (!gameOver && (redButtonPressCount >= 10 || greenButtonPressCount >= 10)) {
                gameOver = true; // Prevent further increments

                System.out.println("Game Over!");

                // Flash both LEDs once
                redLED.setState(true);
                greenLED.setState(true);
                Thread.sleep(500);
                redLED.setState(false);
                greenLED.setState(false);
                Thread.sleep(500);

                // Determine the winner and flash their LED
                if (redButtonPressCount >= 10) {
                    System.out.println("Red Player Wins!");
                    for (int i = 0; i < 5; i++) {
                        redLED.setState(true);
                        Thread.sleep(500);
                        redLED.setState(false);
                        Thread.sleep(500);
                    }
                } else if (greenButtonPressCount >= 10) {
                    System.out.println("Green Player Wins!");
                    for (int i = 0; i < 5; i++) {
                        greenLED.setState(true);
                        Thread.sleep(500);
                        greenLED.setState(false);
                        Thread.sleep(500);
                    }
                }

                break; // Exit the game loop cleanly
            }

            // Small delay to reduce CPU usage
            Thread.sleep(100);
        }
    }
}
/* Screen Dump
Green Button Press Count: 1
Green Button Press Count: 2
Green Button Press Count: 3
Green Button Press Count: 4
Green Button Press Count: 5
Green Button Press Count: 6
Green Button Press Count: 7
Green Button Press Count: 8
Green Button Press Count: 9
Green Button Press Count: 10
Game Over!
Green Player Wins!
 */
