import java.util.*;

class Person1 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person1(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person1{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person0's first name.
     *   @param lastName - A string denoting the Person0's last name.
     *   @param id - An integer denoting the Person0's ID number.
     *   @param scores - An array of integers denoting the Person0's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int avg = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            avg += this.testScores[i];
        }
        avg /= this.testScores.length; // Get the average of the test scores

        char letter;
        if (avg >= 90 && avg <= 100) {
            letter = 'O';
        } else if (avg < 90 && avg >= 80) {
            letter = 'E';
        } else if (avg < 80 && avg >= 70) {
            letter = 'A';
        } else if (avg < 70 && avg >= 55) {
            letter = 'P';
        } else if (avg < 55 && avg >= 40) {
            letter = 'D';
        } else {
            letter = 'T';
        }
        return letter;
    }
}

/**
 * HackerRank Day 12: Inheritance
 *
 *
 * Sample Input for Scanner:
 * Heraldo Memelli 8135627
 * 2
 * 100 80
 * */
class Inheritance {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String firstName = scan.next();
//        String lastName = scan.next();
//        int id = scan.nextInt();
//        int numScores = scan.nextInt();
//        int[] testScores = new int[numScores];
//        for(int i = 0; i < numScores; i++){
//            testScores[i] = scan.nextInt();
//        }
//        scan.close();

        // Hard Coded Input to test (can use Scanner to input just comment below until testScores and uncomment the comments above)
        String firstName = "Heraldo";
        String lastName = "Memelli";
        int id = 8135627;
        int numScores = 2;
        int[] testScores = { 100, 80 };

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
