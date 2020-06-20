import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elems) {
        elements = elems;
    }

    // computeDifference method
    public void computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (min > elements[i]) {
                min = elements[i];
            }
            if (max < elements[i]) {
                max = elements[i];
            }
        }
        maximumDifference = max - min;
    }

} // End of Difference class

/**
 * Day 14: Scope
 * */
public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        sc.close();

        // Hard coded data, but comments above implement the scanner to grab some user input (comment out the statement directly below this line when using the scanner)
        int[] a = { 1, 2, 5 };

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}