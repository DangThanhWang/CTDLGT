package week8;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MaxPQ;

public class Bai1 {
    public static void main(String[] args) {
        MaxPQ<String> pq = new MaxPQ<>();
        In in = new In("C:\\Users\\LENOVO\\IdeaProjects\\Exam\\algs4-data\\tinyPQ.txt");
        String s;
        while(!in.isEmpty()) {
            s = in.readString();
            if(s.equals("-")) {
                System.out.println(pq.delMax());
            } else {
                pq.insert(s);
            }
        }
    }
}
