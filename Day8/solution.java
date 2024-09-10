import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        // Scanner to read input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of entries in the phone book

        // Create a HashMap to store the phone book
        HashMap<String, Integer> phoneBook = new HashMap<>();

        // Read in the phone book entries
        for(int i = 0; i < n; i++) {
            String name = in.next(); // Read name
            int phone = in.nextInt(); // Read phone number
            phoneBook.put(name, phone); // Store in the HashMap
        }

        // Read in the queries and check against the phone book
        while(in.hasNext()) {
            String s = in.next(); // Read next query name

            // Check if the name exists in the phone book
            if(phoneBook.containsKey(s)) {
                // Print the name and phone number in the required format
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                // Print "Not found" if the name is not in the phone book
                System.out.println("Not found");
            }
        }

        in.close(); // Close the scanner
    }
}
