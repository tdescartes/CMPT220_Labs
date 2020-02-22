package lab03;
// The program that calculate the total amount after simple interest
// Descartes Tuyishime
// February 19, 2020

import java.util.Scanner;

public class ComplexLoop {

    public static void main(String args[])
    {
        // s is the instance of Scanner class.
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Deposit : ");
        float deposit = s.nextFloat();

        System.out.print("Enter the annual percentage yield : ");
        float apy  = s.nextFloat();

        System.out.print("Enter the number of months : ");
        int maturity = s.nextInt();

        // using " number" as a counter
        for ( int number = 1; number <= maturity; number++) {

           deposit = deposit + (deposit*(apy/1000));

        }
        // printing out the results out of the for loop
        System.out.print(" The return on investment after "+ maturity + " months is "+ deposit);
    }

}
