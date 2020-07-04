import java.io.*;
import java.util.*;

public class Solution {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        in.nextLine();

        for (int i = 0; i < N; i++) {
            String str = in.nextLine();
            char[] ch = str.toCharArray();

            for (int j = 0; j < ch.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(ch[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < ch.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(ch[j]);
                }
            }

            System.out.println();
        }

        in.close();
    }
}

