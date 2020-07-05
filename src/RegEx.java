import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 28: RegEx, Patterns, and Intro to Databases
 *
 * Sample Input:
 *
 * 6
 * riya riya@gmail.com
 * julia julia@julia.me
 * julia sjulia@gmail.com
 * julia julia@gmail.com
 * samantha samantha@gmail.com
 * tanya tanya@gmail.com
 * */
public class RegEx {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Pattern pattern = Pattern.compile("\\w+@gmail.com");
        ArrayList<String> gmailNames = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find() &&
                    (firstName.length() > 0 && firstName.length() < 21) &&
                    (emailID.length() > 0 && emailID.length() < 51))
            {
                gmailNames.add(firstName);
            }
        }
        Collections.sort(gmailNames);
        for (String name : gmailNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
