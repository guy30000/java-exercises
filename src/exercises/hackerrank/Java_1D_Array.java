package exercises.hackerrank;

import java.util.Scanner;

public class Java_1D_Array {
    //These are givens through a scanner. N is the number of ints to expect and A is the list of ints.
    //This will not run as we dont have the scanner setup. This is just for reference;
    int n=5;
    int[] a = new int[n];
    // a=[10,20,30,40,50]

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int p = scan.nextInt();
            a[i] = p;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}





