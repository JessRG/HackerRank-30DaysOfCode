import java.io.*;
import java.util.*;

/**
 * Day 4: Class vs. Instance
 * */
class Class_VS_Instance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
        int T = 4;
        int input[] = { -1, 10, 16, 18 };

        for (int i = 0; i < T; i++) {
//            int age = sc.nextInt();
            int age = input[i];
            Person0 p = new Person0(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
//        sc.close();
    }
}

class Person0 {
    private int age;

    Person0(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String str;
        if (age < 13) {
            str = "You are young.";
        } else if (age >= 13 && age < 18) {
            str = "You are a teenager.";
        } else {
            str = "You are old.";
        }
        System.out.println(str);
    }

    public void yearPasses() {
        // Increment this person's age.
        age += 1;
    }
}