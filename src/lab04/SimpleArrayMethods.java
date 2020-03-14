package lab04;
// The program with various methods tha
//Descartes Tuyishime
// February March 01, 2020

public class SimpleArrayMethods {
    public static void main(String args[]) {
        int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // The output from the methods (the methods are called with 'integers' as an argument)
        System.out.println("The number of even integers in the array is "+ CountEven(integers));
        System.out.println("The number of integers above average is " + CountAboveAverage(integers));
        System.out.println("The number of positive integers is " + CountPositiveNumbers(integers));
        System.out.println("The biggest integer from the array " + getLargest(integers));
        System.out.println("The smallest integer from the array " + getSmallest(integers));
    }

    // the method for counting even numbers
    public static int CountEven(int[] integers) {
        int counting=0;
        for (int index : integers) {
            // A number modulo 2 with no remainder is even
            if(index% 2== 0 )
            counting+= 1;
        }
        return counting;
    }

    // the method that counts the numbers above the average in the array.
    public static int CountAboveAverage(int[] integers) {
        int sum=0, abcount=0; // declaration of variables needed for incrementation
        for (int index : integers) {
            sum+=index;
        }
       double average= sum / integers.length;
        for (int index : integers) {
            if (index > average)
            abcount+= 1 ;
        }
        return abcount;// returning a number of integers that is that greater average
    }

    //the method that counts the positive numbers in the array
    public static int CountPositiveNumbers(int[] integers) {
        int countPosivitenumber=0;
        for (int index : integers) {
            if(index > 0 )
                countPosivitenumber+= 1;
        }
        return countPosivitenumber;
    }

    // the method that compares and get the largest number in the array
    public static int getLargest(int[] integers) {
        int largest= integers[0];
        for (int index : integers) {
            if(largest < index){
                largest= index;
            }
        }
        return largest;
    }

    //the method that compares and get the least number in the array
    public static int getSmallest(int[] integers) {
        int smallest= integers[0];
        for (int index : integers) {
            if (smallest > index) {
                smallest = index;
            }
        }
        return smallest;
    }

}
