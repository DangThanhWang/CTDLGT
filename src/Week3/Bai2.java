package Week3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Bai2 {
    public static int binarySearch(int[] a, int number) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if(a[m] == number) {
                return m;
            } else if (a[m] > number) {
                r = m - 1;
            } else l = m + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = StdIn.readInt();

        int[] a = new int[n];

        for (int i = 0 ;i < n; i++) {
            a[i] = StdIn.readInt();
        }
        Arrays.sort(a);

        int key = StdIn.readInt();
        StdOut.println(binarySearch(a,key));
    }
}
