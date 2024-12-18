
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);

        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        // Address the LEDs
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Open connections
        redLED.open(1000);
        greenLED.open(1000);
        
        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) {
        	double temperature = temperatureSensor.getTemperature();
        	
            if (temperature >= 20 && temperature <= 24) {
            	System.out.println("The Temperature is: " + Math.round(temperature) + "°C");
            	greenLED.setState(true);
            	redLED.setState(false);
            }
            else
            {
            	System.out.println("The Temperature is out of range.");
            	redLED.setState(true);
            	greenLED.setState(false);
            }
            Thread.sleep(300);
        }
    }
}

  