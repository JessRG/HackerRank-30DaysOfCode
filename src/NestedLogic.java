import java.io.*;
import java.util.*;
import java.util.Arrays;

/**
 * Day 26: Nested Logic
 *
 * Sample Input:
 *
 * 9 6 2015
 * 6 6 2015
 * */
public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String returnedDate = scan.nextLine();
        String expectedDate = scan.nextLine();

        String[] rDate = returnedDate.split(" ");
        String[] eDate = expectedDate.split(" ");
        int[] dateReturned = new int[rDate.length];
        int[] dateDue = new int[eDate.length];

        // for loops to convert string date integers into integer arrays
        // will run two separate loops if return date length and expected date length
        // are different
        if(dateReturned.length == dateDue.length) {
            for (int i = 0; i < dateReturned.length; i++) {
                dateReturned[i] = Integer.parseInt(rDate[i]);
                dateDue[i] = Integer.parseInt(eDate[i]);
            }
        } else {
            for (int i = 0; i < dateReturned.length; i++) {
                dateReturned[i] = Integer.parseInt(rDate[i]);
            }
            for (int i = 0; i < dateDue.length; i++) {
                dateDue[i] = Integer.parseInt(eDate[i]);
            }
        }
        // System.out.println("Returned Date: " + Arrays.toString(dateReturned) + "\nExpected Date: " + Arrays.toString(dateDue));
        int fine = 0;
        if (!Arrays.equals(dateReturned, dateDue)) {
            int rDay = dateReturned[0];
            int eDay = dateDue[0];
            int rMonth = dateReturned[1];
            int eMonth = dateDue[1];
            int rYear = dateReturned[2];
            int eYear = dateDue[2];
            if ((rDay < 0 && rDay > 31 && eDay < 0 && eDay > 31) &&
                (rMonth < 0 && rMonth > 12 && eMonth < 0 && eMonth > 12) &&
                (rYear < 0 && rYear > 3000 && eYear < 0 && eYear > 3000))
            {
                System.out.println("Invalid Gregorian calendar dates.");
            } else {
                if (rMonth == eMonth && rDay > eDay && rYear == eYear) {
                    fine = 15 * (rDay - eDay);
                } else if(rMonth > eMonth && rYear == eYear) {
                    fine = 500 * (rMonth - eMonth);
                } else if (rYear > eYear) {
                    fine = 10000;
                }
            }
        }
        System.out.println(fine);
    }
}

