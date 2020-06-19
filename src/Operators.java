import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 2: Operators
 * */
public class Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // float tip = (float) meal_cost * (float) tip_percent / 100f;
        // float tax = (float) meal_cost * (float) tax_percent / 100f;
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        System.out.println(Math.round(meal_cost + tax + tip));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        double meal_cost = scanner.nextDouble();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int tip_percent = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int tax_percent = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        double meal_cost = 12.00;
        int tip_percent = 20;
        int tax_percent = 8;

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}