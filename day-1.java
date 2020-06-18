import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
      
       
        /* Declare second integer, double, and String variables. */
          int a;
          double b;
          String A;
        /* Read and save an integer, double, and String to your variables.*/
              a=scan.nextInt();
              b=scan.nextDouble();
              scan.nextLine();
              A=scan.nextLine();
   
         System.out.println(i+a);
         System.out.println(d+b);
         System.out.println(s.concat(A));
            
        scan.close();
    }
}
