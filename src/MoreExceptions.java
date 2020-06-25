import java.util.*;
import java.io.*;

//Write your code here
class Calculator0 {

    public int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        } else {
            // return Math.pow(n, p);
            int temp = 1;
            for (int i = 0; i < p; i++) {
                temp *= n;
            }
            return temp;
        }
    }
}

/**
 * Day 17: More Exceptions
 *
 * Sample Input:
 * 4
 * 3 5
 * 2 4
 * -1 -2
 * -1 3
 * */
class MoreExceptions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator0 myCalculator = new Calculator0();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

