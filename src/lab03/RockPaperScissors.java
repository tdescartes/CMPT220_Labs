package lab03;

import java.util.*;

public class RockPaperScissors {
    public static void main(String args[])
    {
        System.out.print("Welcome to the game of Paper, Rock, Scissors.\n");

        // s is the instance of Scanner class.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your choices from Paper, Rock, Scissors: ");
        String opponent = s.nextLine().toLowerCase();

        while (true) {

            // create random object
            Random random = new Random();

            // creating a variable "n" to hold the value of from Random method.
            int n = random.nextInt(2);

            // Creating a string command for the computer.
            String [] moves = {"rock", "paper", "scissors"};

            // checking each scenario in accordance to how the game is played
            if ( moves[n].equals("rock")  && opponent.equals("paper")){

                System.out.print("You Win ");
                break;
            }

            if ( moves[n].equals("paper")  && opponent.equals("rock")){

                System.out.print("You Lose ");
                break;
            }

            if ( moves[n].equals("paper")  && opponent.equals("scissors")){

                System.out.print("You Win ");
                break;
            }

            if ( moves[n].equals("scissors")  && opponent.equals("paper")) {

                System.out.print("You Lose ");
                break;
            }


            if ( moves[n].equals("scissors")  && opponent.equals("rock")){

                System.out.print("You Win ");
                break;
            }

            if ( moves[n].equals("rock")  && opponent.equals("scissors")) {

                System.out.print("You Lose ");
                break;
            }

            else { // the last case scenarios is when moves [n].equals(opponent)
                // then there will be a draw, then we will give an apportunity the user to enter another move.
                System.out.print("You draw!\n");

                System.out.print("Enter your choices, again, from Paper, Rock, Scissors:  ");
                 opponent = s.nextLine().toLowerCase();
            }
        }

    }

}
