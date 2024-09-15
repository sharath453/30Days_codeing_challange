import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[32];
        int value=0;

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        while(n>0)
        {
            arr[value]=n%2;
            n= n/2;
            value++;
        }
        
        int currentcount=0;
        int maxcount=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==1)
           {
              currentcount++;
              if(currentcount>maxcount)
              {
                  maxcount=currentcount;
              } 
           }
              else
              {
                  currentcount=0;
              }
        }
        System.out.println(maxcount);
        bufferedReader.close();
    }
}
