package exercises.hackerrank.Scope;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] a = new int[3];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
        a[0] = 1;
        a[1] = 2;
        a[2] = 5;
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}