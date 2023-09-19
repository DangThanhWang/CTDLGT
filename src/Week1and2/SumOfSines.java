package Week1and2;

import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radians = sc.nextDouble();
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);
    }
}
