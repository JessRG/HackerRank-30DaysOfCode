import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 10: Binary Numbers
 * */
public class BinaryNumbers {

    public static int consecutiveOnes(int num) {
        int n = num;
        int count = 0;
        int consecutiveMax = 0;
        // Convert to binary number and highest sum of consecutive 1s
        for( int i = 0; n > 0; i++ ) {
            int remainder = n % 2;
            n = n / 2;
            if (remainder == 1) {
                count++;
                consecutiveMax = Math.max(consecutiveMax, count);
                // System.out.println(consecutiveMax);
            } else {
                count = 0;
            }
        }
        return consecutiveMax;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = 14;

        consecutiveOnes(n);
        System.out.println(consecutiveOnes(n));
//        scanner.close();
    }
}
