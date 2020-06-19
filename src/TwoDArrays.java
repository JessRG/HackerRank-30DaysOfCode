import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 11: 2D Arrays
 *
 * Sample Data Input for Scanner:
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * */
public class TwoDArrays {

    public static int largestHourGlassSum(int[][] arr) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                result = Math.max(result, arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        // Hard code input for 2DArray
        String[] arrItems = {
                "1 1 1 0 0 0",
                "0 1 0 0 0 0",
                "1 1 1 0 0 0",
                "0 0 2 4 4 0",
                "0 0 0 2 0 0",
                "0 0 1 2 4 0"
        };

        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String[] arrRowItems = arrItems[i].split(" ");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);

                arr[i][j] = arrItem;
            }
        }
        System.out.println(largestHourGlassSum(arr));

//        scanner.close();
    }
}

