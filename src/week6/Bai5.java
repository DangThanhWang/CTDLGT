package week6;

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

class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        int i;
        for(i = 2; i <= n; i++) {
            int j;
            Integer sort = arr.get(i - 1);
            for (j = i - 2; j >= 0; j--) {
                if (arr.get(j) > sort) {
                    arr.set(j + 1, arr.get(j));
                } else {
                    break;
                }
            }
            arr.set(j + 1, sort);
            for (j = 0; j < n; j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }

    }

}

public class Bai5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
