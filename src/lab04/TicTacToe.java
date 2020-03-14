package lab04;
import java.util.Scanner;

public class TicTacToe {
        /** Create Scanner to read input from **/
        private static final Scanner scanner = new Scanner(System.in);

        /**
         * Entry point to our game.
         *
         * @param args commandline arguments.
         */

       // symbols used in the games.
       private static final String[] symbol = {" ", "x", "o"};

        public static void main(String[] args) {
               int[][] board = {{0,0,0},{0,0,0},{0,0,0}};

                // Initialize player
                int player = 1;

                // Main game loop:
                while (hasbanks(board)) {
                        //Display game state.
                        printBoard(board);

                        // Get player move.
                        int[] coordinates = getPlayerMove();
                        int row = coordinates[0];
                        int col = coordinates[1];

                        //Mark the specified spaces.
                        markBoard(board, row, col, player);

                        // Switch player for next turn.
                        player = (player % 2) + 1;
                }
        }

        //method to access the col,row, and the board
        private static boolean hasbanks(int[][] board) {
            boolean flag = false;
            for (int[] row : board) {
                for (int square : row) {
                    if (square == 0)
                        flag= true;

                }
            }
                return flag;

        }

        // method to print the board
        private static void printBoard (int[][] board){
            System.out.println("+-----------+");
            for(int[] row: board){
                String rowStr= "| ";
                for(int square: row){
                    rowStr= rowStr + symbol[square] + " | ";
                }
                System.out.println(rowStr);

                System.out.println("+-----------+");
            }

        }

        // Method to prompt the user to input their moves
        private static int[] getPlayerMove(){
            System.out.println("Enter the row number: ");
            int row = scanner.nextInt();
            System.out.println("Enter the column number: ");
            int col =scanner.nextInt();

            return new int[] {row, col};
        }

        // Method to assign the player's move to the board of the game
        private static void markBoard (int[][] board, int row, int col, int player ){
            if(board[row][col] == 0){
                board[row][col] = player;
            }
        }
}