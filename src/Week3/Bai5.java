package Week3;

import java.util.Scanner;

public class Bai5 {
    public static int pairs(int [] arr, int n, int k){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(pairs(arr, n, k));
    }
}
