package Week14.ShortestReach2;

import java.util.*;

public class Solution {
    private static class Node implements Comparable<Node> {
        int id;
        long dist;

        public Node(int id, long dist) {
            this.id = id;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other) {
            return Long.compare(this.dist, other.dist);
        }
    }

    public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
        // Write your code here
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);
            graph.get(u).add(new Node(v, w));
            graph.get(v).add(new Node(u, w));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[s] = 0;
        pq.add(new Node(s, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            for (Node adj : graph.get(node.id)) {
                long newDist = dist[node.id] + adj.dist;
                if (newDist < dist[adj.id]) {
                    pq.remove(new Node(adj.id, dist[adj.id]));
                    dist[adj.id] = newDist;
                    pq.add(new Node(adj.id, dist[adj.id]));
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i != s) {
                result.add(dist[i] == Long.MAX_VALUE ? -1 : (int) dist[i]);
            }
        }
        return result;
    }
}
