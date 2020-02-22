package lab03;
// The program that prints two separate triangle numberss
// Descartes Tuyishime
// February 19, 2020

public class NestedLoops {

    public static void main(String args[]) {
        int j; // declaring the counter

        // the First loop for the inverse triangle
        for (int i = 5; i > 0; --i) {
            // initialising starting number
            int num = 1;

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (j = i; j > 0; --j) {
                // printing num with a space
                System.out.print(" " + num + " ");

                //incrementing value of num
                num++;
            }

            // ending line after each row
            System.out.println();
        }


        //the second loop for the standing triangle
        for (int d = 0; d < 5; d++) {
            // initialising starting number
            int num1 = 1;

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int g = 0; g <= d; g++) {
                System.out.print(" ");
                // printing num with a space
                System.out.print(num1 + " ");

                //decrementing value of num1
                num1++;
            }
            // ending line after each row
            System.out.println("");
        }

    }
}