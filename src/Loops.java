import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 5: Loops
 * */
public class Loops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + (i+1) + " = " + (n * (i+1)));
        }
//        scanner.close();
    }
}
