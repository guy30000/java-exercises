package exercises.hackerrank.Array_Play;

import jdk.nashorn.internal.parser.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays_DS {
    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0;i<a.length-1;i++){
            b[a.length-i-1] = a[i];
        }





        return b;
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//       int arrCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
        int[] arr = new int[4];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


            arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 1;


        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            //bufferedWriter.write(String.valueOf(res[i]));
            System.out.println(arr[i]);


            if (i != res.length - 1) {
               // bufferedWriter.write(" ");
            }
        }

       // bufferedWriter.newLine();

        //bufferedWriter.close();


        //scanner.close();
    }
}