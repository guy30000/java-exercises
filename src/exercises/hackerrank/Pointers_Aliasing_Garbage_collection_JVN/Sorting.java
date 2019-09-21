package exercises.hackerrank.Pointers_Aliasing_Garbage_collection_JVN;

import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sorting {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
//copy zone
        int numberOfSwaps = 0;
        for (int i = 0; i < a.length; i++) {
            // Track number of elements swapped during a single array traversal


            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp1 = a[j];
                    int temp2 = a[j + 1];
                    a[j + 1] = temp1;
                    a[j] = temp2;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
//            if (numberOfSwaps == 0) {
//                break;
//            }
        }
            System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
            System.out.println("First Element: " + a[0]);
            System.out.println("Last Element: " + a[a.length-1]);

            //end copy
        }
    }

