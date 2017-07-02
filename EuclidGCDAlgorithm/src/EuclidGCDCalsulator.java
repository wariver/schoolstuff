import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class EuclidGCDCalsulator {
    private static int first = 0,second = 0;
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Please enter the first number ");
        scanner = new Scanner(System.in);
        first = scanner.nextInt();

        System.out.println("Please enter the second number ");
        second = scanner.nextInt();

        System.out.println("The first number is " + first);
        System.out.println("The second number is " + second);


        System.out.println("The GCD number is " + EuclidGCDMethod(first, second));
        System.out.println("RECURSION : The GCD number is " + recurssionEuclidGCD(first, second));
        System.out.println("SCHOOL PROJECT : The GCD number is " + EuclidGCDSchoolMethod(first, second));
    }
    private static int EuclidGCDMethod(int m, int n){
        int r;
            while (n % m != 0) {
                r = n % m;
                n = m;
                m = r;
            }
            return m;
    }
    /*This methods starts dividing the numbers starting with the smaller number of the two...
    * The iteration continue and breaks when the first divisor completely divides the two numbers
    * thus rightfully becoming the G.C.D.*/
    private static int EuclidGCDSchoolMethod(int m, int n){
        int hcf = 0;
        int min = Math.min(m,n);


        for(int i= min; i >= 1; i--)
        {
            if(m%i == 0 && n%i == 0)
            {
                hcf = i;
                break;
            }
        }
        return hcf;
    }
    /*RESEARCH FROM THE INTERNET*/
    //the following method uses recursion to solve GCD...the number of lines of code are much less of course.
    private static int recurssionEuclidGCD(int m, int n){
        if(n == 0)return m;
        else return recurssionEuclidGCD(n, m % n);
    }
}