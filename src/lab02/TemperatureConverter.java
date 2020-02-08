package lab02;
import java.util.Scanner;


public class TemperatureConverter {

    public static void main(String[] args) {

        // Importing scanner
        Scanner input = new Scanner(System.in);

        // requesting a number to be converted from the user.
        System.out.println("Enter degrees to be converted: ");
        String degrees = input.next();

        // splitting and getting the last letter that correspond to the measurements
        char metrics = degrees.charAt(degrees.length()-1);


        // splitting and getting the numerical value of the string.
        degrees= (degrees.substring(0, degrees.length()-1));

        // converting string to double
        double degree = Double.parseDouble(degrees);

        // If the degrees are entered in Celcius degrees.
        if (metrics == 'C') {
            // the output afterward.
            System.out.println( degrees + " Celcius degrees is equivalent " + ( 1.8*(degree) + 32) +" Farheneit degrees");
        }

        // If the degrees are entered in farheneit
        else if ( metrics == 'F') {
        // the output afterward.
            System.out.println( degrees + " Farheneit degrees is equivalent " + ( 5*(degree - 32)/9) + " Celcius degrees");
        }


    }
}


