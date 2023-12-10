package week8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCookies = scanner.nextInt();
        int minSweetness = scanner.nextInt();
        int count = 0;
        PriorityQueue<Integer> sweetnessHeap = new PriorityQueue<>(numCookies);

        for (int i = 0; i < numCookies; i++) {
            int sweetness = scanner.nextInt();
            sweetnessHeap.add(sweetness);
        }

        while (sweetnessHeap.peek() < minSweetness && sweetnessHeap.size() > 1) {
            int newSweetness = sweetnessHeap.poll() + 2 * sweetnessHeap.poll();
            sweetnessHeap.add(newSweetness);
            count++;
        }

        if (sweetnessHeap.peek() >= minSweetness) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
