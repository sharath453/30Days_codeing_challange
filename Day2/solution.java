import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code herepublic static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Calculate the tip and tax amounts
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        
        // Calculate the total cost
        double totalCost = meal_cost + tip + tax;
        
        // Round the result to the nearest integer
        int roundedTotalCost = (int) Math.round(totalCost);
        
        // Print the total cost
        System.out.println(roundedTotalCost);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
