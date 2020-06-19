import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Day 1: Data Types
 * */
public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int num;
        double dnum;
        String str;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
//        num = scan.nextInt();
//        dnum = scan.nextDouble();
//        scan.nextLine();
//        str = scan.nextLine();

        num = 12;
        dnum = 4.0;
        str = "is the best place to learn and practice coding!";

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + num);

        /* Print the sum of the double variables on a new line. */
        System.out.println(String.format("%.1f", d + dnum));
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + str);

        scan.close();
    }
}