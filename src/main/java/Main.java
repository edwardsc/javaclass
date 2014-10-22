import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by EdwardsMAC on 10/20/14.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("Welcome to the Assignment Driver!");
        System.out.println("Enter option number: ");
        System.out.println("1 for distance converter");
        System.out.println("2 for foo");
        System.out.println("3 for bar");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String option = bufferedReader.readLine();

        switch (option){
            case "1":
                DistanceFormulaConverter.calculateFeetPerMeter();
                DistanceFormulaConverter.calculateMetersPerFoott();
                break;
            case "2":
                System.out.print("Under construction");
                break;
            case "3":
                System.out.print("Under construction");
                break;
            default:
                System.out.print("Invalid command");
                System.exit(-1);
        }

    }
}