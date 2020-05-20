package lab07;

public class RecursivePlayground {

    public static void main(String[] args){
        long number = 25L;
        System.out.println("Factorial (" + number + "): " + factorial(number));
        System.out.println("oldFactorial (" + number + "): " + olfactory(number));

    }

    public static long factorial(long number) {
        return factorial(number, 1L);
    }

    private static long factorial(long number, long result) {
        if (number ==0) {
            return result;
        }
        return (number * factorial(number -1, number*result));
    }

    
    public static long olfactory(long number) {
        if (number <= 1) {
            return 1;
        }
        return (number * olfactory(number -1));
    }

}


