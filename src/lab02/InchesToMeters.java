package lab02;

import java.util.Scanner;

    public class InchesToMeters {


        public static void main(String[] args) {

            // Importing
            Scanner input = new Scanner(System.in);

            // assign the variable METERS_PER_INCH  with a conversion rate from inches to meters.
            double METERS_PER_INCH = 0.0254;

            // requesting a number to be converted from the user.
            System.out.println("Enter a number in inches");
            double inches = input.nextDouble();


            // creating the outputs for the calculated/converted measurement.
            System.out.println(inches + " inches are  equivalent to "+ (inches * METERS_PER_INCH)+ " meters");

            }
        }


