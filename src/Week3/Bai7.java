package Week3;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Bai7 {
    static void threeSum(int[] a) {
        Arrays.sort(a);
        int n = a.length;

        for(int i =0 ; i < n-2; i++) {
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                if(a[i] + a[j] + a[k] == 0) {
                    StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    j++;
                    k--;
                }else if(a[i] + a[j] + a[k] < 0)j++;
                else k--;
            }
        }
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        threeSum(a);
    }
}