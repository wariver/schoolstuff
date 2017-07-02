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
    }
    private static int EuclidGCDMethod(int m, int n){
        int r = 0;
        if (n%m == 0)
            return m;
        else {
            while (n % m != 0) {
                r = n % m;
                n = m;
                m = r;
            }
            return m;
        }

    }
}