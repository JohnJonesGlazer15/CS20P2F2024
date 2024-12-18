// Add Phidgets Library
import com.phidget22.*;

public class GettingStarted3 {
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

        // Main loop
        while (true) {
            // Get current states
            boolean redButtonCurrentState = redButton.getState();
            boolean greenButtonCurrentState = greenButton.getState();

            // Check for red button press (false -> true)
            if (redButtonCurrentState == true && redButtonPreviousState == false) {
                greenButtonPressCount++;
            }
            // Update previous state for red button
            redButtonPreviousState = redButtonCurrentState;

            // Check for green button press (false -> true)
            if (greenButtonCurrentState == true && greenButtonPreviousState == false) {
                redButtonPressCount++;
            }
            // Update previous state for green button
            greenButtonPreviousState = greenButtonCurrentState;

            // Control red LED with green button
            if (greenButton.getState()) { // Button is pressed
                redLED.setState(false); // Turn off red LED
            } else { // Button is released
                redLED.setState(true); // Turn on red LED
            }

            // Control green LED with red button
            if (redButton.getState()) { // Button is pressed
                greenLED.setState(false); // Turn off green LED
            } else { // Button is released
                greenLED.setState(true); // Turn on green LED
            }

            // Print button press counts
            System.out.println("Red Button Press Count: " + redButtonPressCount);
            System.out.println("Green Button Press Count: " + greenButtonPressCount);

            // Sleep to reduce CPU usage
            Thread.sleep(150);
        }
    }
}
