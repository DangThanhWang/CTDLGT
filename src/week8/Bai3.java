package week8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result3 {
    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        for (int i=0; i < A.size(); i++) {
            pqueue.add(A.get(i));
        }

        int res = 0;
        while (pqueue.size() > 1 && pqueue.peek() <= k) {
            int first = pqueue.poll();
            int second = pqueue.poll();
            pqueue.add(first + 2*second);
            res++;
        }

        if (pqueue.peek() < k) {
            return -1;
        } else
        {
            return res;
        }

    }
}

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, K;
        N = scanner.nextInt();
        K = scanner.nextInt();

        List<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        int result = Result3.cookies(K, A);
        System.out.println(result);
    }
}
