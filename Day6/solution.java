import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<t;i++)
        {
            String str=sc.nextLine();
            
            StringBuilder even=new StringBuilder();
            StringBuilder odd=new StringBuilder();
            
            
            for(int j=0;j<str.length();j++)
            {
              if(j%2==0)
              {
                  even.append(str.charAt(j));
              } 
              else{
                  odd.append(str.charAt(j));
              } 
            }
            System.out.println(even.toString()+ " " +odd.toString());
        }
    }
}
