import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by EdwardsMAC on 10/21/14.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) throws IOException {
        /*
        //Write a program that reads a Celsius degree in a double value from the console,
        then converts it to Fahrenheit and displays the result.
        The formula for the conversion is as follows:
        fahrenheit = (9 / 5) * celsius + 32
        Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8

         */
        System.out.println("Enter temp in degree C");
        //String c = System.console().readLine();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String c = bufferedReader.readLine();
        //System.out.println("You entered:" + c);
        try {
            double degreeC = Double.parseDouble(c);

            System.out.println("Fahrenheit value of " + degreeC + " degree C" + " is " + CtoF(degreeC) + " degree F");
        } catch(NumberFormatException e){
            System.out.println("Sorry not valid temperature");
            System.exit(-1);
        }



    }
    private static double CtoF(double c){
        double f = (9.0/5.0) * c + 32;
        return f;
    }
}
