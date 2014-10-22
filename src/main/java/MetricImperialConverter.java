import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by edwardsb on 10/21/14.
 */
public class MetricImperialConverter {
    private static double METERS_PER_FOOT = 0.3048;
    private static double FEET_PER_METER = 3.28084;
    private static double meters = 0;
    private static double feet = 0;

    public static void calculateFeetPerMeter() throws IOException {
        System.out.print("Enter feet: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringF = bufferedReader.readLine();
        try {
            feet = Double.parseDouble(stringF);
            System.out.println("\n" + feet + " ft = " + feetToMeters(feet) + " m");
        } catch(NumberFormatException e){
            System.out.println("Sorry not valid measurement");
        }
    }

    public static void calculateMetersPerFoott() throws IOException {
        System.out.print("Enter meters: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringF = bufferedReader.readLine();
        try {
            meters = Double.parseDouble(stringF);
            System.out.println("\n" + meters + " m = " + metersToFeet(meters) + " ft");
        } catch(NumberFormatException e){
            System.out.println("Sorry not valid measurement");
        }
    }


    public static double feetToMeters(double feet){
        return feet * METERS_PER_FOOT;
    }

    public static double metersToFeet(double meters){
        return meters * FEET_PER_METER;
    }
}
