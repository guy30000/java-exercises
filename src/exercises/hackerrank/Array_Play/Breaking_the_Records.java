package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Breaking_the_Records {


    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {


        int[] resultsScor = new int[2];
        int min=scores[0],max=scores[0],minCount=0,maxcount=0;



        for (int i=1;i<scores.length;i++){
            if (scores[i]<min) {
                min = scores[i];
                minCount++;
            }
            if (scores[i]>max) {
                max = scores[i];
                maxcount++;
            }
        }

        resultsScor[0]=maxcount;
        resultsScor[1]=minCount;
        return resultsScor;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        int[] scores = new int[n];
        int[] scores = new int[9];

//        String[] scoresItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int scoresItem = Integer.parseInt(scoresItems[i]);
//            scores[i] = scoresItem;
//        }
        scores[0] = 10;
        scores[1] = 5;
        scores[2] = 20;
        scores[3] = 20;
        scores[4] = 4;
        scores[5] = 5;
        scores[6] = 2;
        scores[7] = 25;
        scores[8] = 1;

        int[] result = breakingRecords(scores);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

