import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int d1=scn.nextInt();
        int m1=scn.nextInt();
        int y1=scn.nextInt();
        int d2=scn.nextInt();
        int m2=scn.nextInt();
        int y2=scn.nextInt();
        int fine;
        if (y1 > y2) {
           fine = 10000;
        } else if (m1 >m2&& (y1 >= y2)) {
            fine = 500 * (m1 - m2);
        } else if (d1 > d2 && (m1 >= m2) && (y1 >= y2)) {
            fine = 15 * (d1 - d2);
        } else {
            fine = 0;
        }

       System.out.println(fine);

    }
}

