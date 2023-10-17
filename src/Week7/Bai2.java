package Week7;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.StdArrayIO;

public class Bai2 {
    public static void main(String[] args) {
        In in = new In("C:\\Users\\LENOVO\\IdeaProjects\\Exam\\algs4-data\\4Kints.txt");
        int[] oldArray = in.readAllInts();
        Integer[] newArray = new Integer[oldArray.length];
        int i = 0;
        for (int value : oldArray) {
            newArray[i++] = Integer.valueOf(value);
        }
        long start = System.currentTimeMillis();
        Merge.sort(newArray);
        long end = System.currentTimeMillis();

        i = 0;
        for (Integer value : newArray) {
            oldArray[i++] = Integer.parseInt(value.toString());
        }
        System.out.println("Mang sau sap xep: ");
        StdArrayIO.print(oldArray);

        System.out.println("Thoi gian chay mergesort: ");
        System.out.println(end - start);
    }
}

