import java.io.*;
import java.util.*;

/**
 * Day 6: Let's Review
 * */
public class Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scan = new Scanner(System.in);
//        int testCases = scan.nextInt();
//        scan.nextLine();
//
//        // Read the different strings from input
//        List<String> strs = new ArrayList<>();
//        for (int i = 0; i < testCases; i++) {
//            strs.add(scan.nextLine());
//        }
        List<String> strs = new ArrayList<>();
        strs.add("Hacker");
        strs.add("Rank");

        // print out the even letters and the odd letters concatenated together with space between
        for (String str: strs) {
            StringBuffer evenLtrs = new StringBuffer();
            StringBuffer oddLtrs = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    evenLtrs.append(str.charAt(i));
                } else {
                    oddLtrs.append(str.charAt(i));
                }
            }
            evenLtrs.append(" ");
            System.out.println(evenLtrs.append(oddLtrs));
        }

        // Build even string letters and odd string letters
    } // End of main
}
