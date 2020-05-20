import java.util.Scanner;

public class GDCRecursiveMethod{


    static int gcd(int x,int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }


    public static void main(String[] args){

        Scanner S= new Scanner(System.in);

        System.out.println("Enter the first value for GDC");
        int m= S.nextInt();

        System.out.println("Enter the second value for GDC");
        int n= S.nextInt();
    }





}
