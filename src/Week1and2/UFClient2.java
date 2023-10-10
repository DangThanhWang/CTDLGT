package Week1and2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.UF;

public class UFClient2 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        UF uf = new UF(n);
        boolean isConnected = false;
        int count = 0;
        while(!StdIn.isEmpty() && count != n-1){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            uf.union(p, q);
            count++;
            if(uf.count() == 1 && !isConnected){
                System.out.println(count);
                isConnected = true;
            }
        }
        if(!isConnected) System.out.println("FAILED");
    }
}
