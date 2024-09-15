import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // List to store the 6x6 matrix
        List<List<Integer>> arr = new ArrayList<>();

        // Reading the 6x6 matrix from input
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        // Initialize maxSum to the smallest possible integer
        int maxSum = Integer.MIN_VALUE;

        // Iterate through possible top-left corners of hourglasses
        for (int i = 0; i < 4; i++) { // Row index for hourglass top
            for (int j = 0; j < 4; j++) { // Column index for hourglass top
               
                // Calculate the sum of the hourglass centered at (i, j)
                int currentSum = 
                    arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                                      arr.get(i + 1).get(j + 1) +
                    arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                
                // Update maxSum if currentSum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        
        // Print the result
        System.out.println(maxSum);
    }
}
