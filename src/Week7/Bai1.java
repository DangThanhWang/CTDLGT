package Week7;

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

class Result1 {

    /*
     * Complete the 'introTutorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER V
     *  2. INTEGER_ARRAY arr
     */

    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
//        int lo = 0;
//        int hi = arr.size() - 1;
//        while(lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//            if((int) arr.get(mid) == V) {
//                return mid;
//            }
//            if((int) arr.get(mid) < V) hi = mid - 1;
//            if((int) arr.get(mid) > V) lo = mid + 1;
//        }
//        return -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == V) return i;
        }
        return -1;
    }

}

public class Bai1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int V = Integer.parseInt(bufferedReader.readLine().trim());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result1.introTutorial(V, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}