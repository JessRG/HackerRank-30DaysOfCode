import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 3: Intro to Conditional Statements
 * */
public class ConditionalStatements0 {

    // If  is odd, print Weird
// If  is even and in the inclusive range of 2 to 5, print Not Weird
// If  is even and in the inclusive range of 6 to 20, print Weird
// If  is even and greater than 20, print Not Weird
    public String checkNum(int num) {
        if (num % 2 == 0 && num >= 2 && num <= 5) {
            return "Not Weird";
        } else if (num % 2 == 0 && num >= 6 && num <= 20) {
            return "Weird";
        } else if (num % 2 == 0 && num > 20) {
            return "Not Weird";
        } else {
            return "Weird";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        ConditionalStatements0 obj = new ConditionalStatements0();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(obj.checkNum(N));

        scanner.close();
    }
}