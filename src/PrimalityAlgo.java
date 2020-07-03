import java.io.*;
import java.util.*;

/**
 * Day 25: Running Time and Complexity
 *
 * Sample Input:
 *
 * 3
 * 12
 * 5
 * 7
 * */
public class PrimalityAlgo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testNums = scan.nextInt();
        int[] nums = new int[testNums];
        for (int i = 0; i < testNums; i++) {
            nums[i] = scan.nextInt();
            // System.out.println(nums[i]);
            // isPrime(nums[i]);
            System.out.println(isPrime(nums[i]) ? "Prime" : "Not prime");
        }
    }

    public static boolean isPrime(int num) {
        // for (int i = 1; i < num; i++) {
        //     if (num % i == 0 && i > 1) {
        //         System.out.println("Not prime");
        //         return;
        //     }
        // }
        // System.out.println("Prime");
        if (num < 2) return false; // number less than 2 return false
        if (num == 2) return true; // number equals 2 return true
        if (num % 2 == 0) return false; // if even number return false (2 not included)
        for (int i = 3; (i*i) <= num; i+=2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}