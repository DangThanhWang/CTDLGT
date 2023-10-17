package Week7;

import java.util.Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;

class Result7 {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        // int lo = 0;
        // int hi = arr.size() - 1;
        // int mid = hi / 2;
        // while(hi > lo) {
        //     int i = 0;
        //     int j = arr.size();
        //     while(true) {
        //         while(arr.get(++i).compareTo(arr.get(lo)) < 0) {
        //             if (i == arr.size() - 1) break;
        //         }
        //         while (arr.get(--j).compareTo(arr.get(lo)) > 0) {
        //             if(j == 0) break;
        //         }
        //         if(i >= j) break;
        //         Collections.swap(arr, i, j);
        //     }
        //     Collections.swap(arr, lo, j);
        //     if(j < mid) lo = j + 1;
        //     else if(j > mid) hi = j - 1;
        //     else return (int) arr.get(mid);
        // }
        // return (int) arr.get(mid);
        int n = arr.size();
        int[] newArr = new int[n];
        for(int i = 0; i < n; i++) {
            newArr[i] = arr.get(i);
        }
        Arrays.sort(newArr);
        return newArr[(n-1)/2];
    }

}

public class Bai7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result7.findMedian(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
