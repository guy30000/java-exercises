package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class New_Year_Chaos {

    static void minimumBribes(int[] q) {
        int counts=0;
        int tooCharticFlag = 0;
        for (int i=0;i<q.length-1;i++){
            int roundCount = q[i]-i-1;

            if (roundCount>2){
                System.out.println("Too chaotic");
                tooCharticFlag = 1;
                break;
            }
            if (roundCount<0)roundCount=0;
            counts+=roundCount;

        }
        if (tooCharticFlag == 0)System.out.println(counts);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            int t = 2;
            int n = 8;

            int[] q = new int[n];
            q[0] = 1;
            q[1] = 2;
            q[2] = 5;
            q[3] = 3;
            q[4] = 7;
            q[5] = 8;
            q[6] = 6;
            q[7] = 4;

//            String[] qItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//            for (int i = 0; i < n; i++) {
//                int qItem = Integer.parseInt(qItems[i]);
//                q[i] = qItem;
//            }

            minimumBribes(q);
        }

//        scanner.close();
    }

