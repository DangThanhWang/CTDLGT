package week8;

import java.io.*;
import java.util.*;

public class Bai2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int length = A.length();
        String reverse = "";
        for ( int i = length - 1; i >= 0; i-- )
        {
            reverse = reverse + A.charAt(i);
        }

        if (A.equals(reverse))
        {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}