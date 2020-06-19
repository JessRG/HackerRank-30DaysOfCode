//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

/**
 * Day 8: Dictionaries and Maps
 *
 * Sample input data to enter for Scanner:
 * 3
 * sam 99912222
 * tom 11122222
 * harry 12299933
 * sam
 * edward
 * harry
 * tom
 * */
class DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>(); // Phone Book
        int n = in.nextInt();

        // For loop to grab the input
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            // input name and phone# as key,value pairs in Phone Book
            phoneBook.put(name, phone);
        }
        // Queries to the phone book
        while(in.hasNext()){
            String s = in.next();
            // Write code here

            if (s.equals("-1")) {
                break;
            }
            // Check to see if name(Key) is contained within the Phone Book
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
