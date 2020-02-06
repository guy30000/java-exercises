package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import jdk.nashorn.internal.parser.Scanner;

public class Sock_Merchant {


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int pairs = 0;
        for (int i=0;i<n;i++) {
            if (counts.containsKey(ar[i])) {
                counts.put(ar[i], counts.get(ar[i]) + 1);  /////
                //System.out.println("second+ " + counts.get(ar[i]) + " " + ar[i]);
            } else {
                counts.put(ar[i], 1);
                //System.out.println("first " + counts.get(ar[i]) +" " + ar[i]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet())    {
            //System.out.println(entry.getKey() + " " + entry.getValue());
            int entryPair = entry.getValue()/2;
            pairs+= entryPair;
        }
    //System.out.println(pairs);
    return pairs;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[9];

//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 20;
        ar[3] = 10;
        ar[4] = 10;
        ar[5] = 30;
        ar[6] = 50;
        ar[7] = 10;
        ar[8] = 20;

        int result = sockMerchant(9, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}
