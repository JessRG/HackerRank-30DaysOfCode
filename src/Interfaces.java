import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator1 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                //System.out.printf("%d %d ", num, i);
                // if quotient is equal to the divisor just add the divisor (add value once)
                if (n/i == i) {
                    sum += i;
                }
                // if  quotient is not equal to the divisor then add both
                else {
                    sum += n/i + i;
                }
            }
        }
        return sum;
    }
}

/**
 * Day 19: Interfaces
 *
 * Sample Input:
 * 6
 * 100
 * */
class Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator1();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}