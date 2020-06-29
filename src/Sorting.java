import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Day 20: Sorting
 *
 * Sample Input:
 * 3
 * 3 2 1
 * */
public class Sorting {

    public static void bubbleSort(int[] arr, int n) {
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in descending order
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        bubbleSort(a, n);
        System.out.println("First Element: " + a[0] + "\nLast Element: " + a[n - 1]);
    }
}