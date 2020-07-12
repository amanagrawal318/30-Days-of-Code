import java.io.*;
import java.util.*;

public class Solution {
    static void prime(int n)
    {
        boolean isprime=true;
        if(n<=1)
             {
                System.out.println("Not prime");
                isprime=false;
             }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            
            if(n%i==0)
            {
                System.out.println("Not prime");
                isprime=false;
                break;
            }

        }
        if(isprime)
        {
            System.out.println("Prime");
        }
        
    }
    public static void main(String[] args) {
        /* Enter your code here.Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=scn.nextInt();
            prime(n);
        }
    }
}


