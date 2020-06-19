import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 7: Arrays
 * */
public class Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = 4;

        int[] arr = new int[n];

//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arrItems = { 1, 4, 3, 2 };

        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
            int arrItem = arrItems[i];
            arr[i] = arrItem;
        }

        StringBuffer str = new StringBuffer();
        for (int i = n - 1; i >= 0; i--) {
            str.append(arr[i]);

            if (i > 0) {
                str.append(" ");
            }
        }

        System.out.println(str);

        scanner.close();
    }
}
