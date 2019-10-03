package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sparse_Arrays {// Complete the matchingStrings function below.


    static int[] matchingStrings(String[] strings, String[] queries) {
        //copy
        int[] result= new int[queries.length];
        for (int i = 0;i<queries.length;i++){
            int count = 0;
            for (int j = 0;j<strings.length;j++){
                if (queries[i].equals(strings[j]))count++;
               //System.out.println(queries[i] + " - " + strings[j]);
            }
            result[i] = count;
        }
        //for (int i = 0;i<result.length;i++)System.out.println(result[i]);
        return result;
        //end copy
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int stringsCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[3];

//        for (int i = 0; i < stringsCount; i++) {
//            String stringsItem = scanner.nextLine();
//            strings[i] = stringsItem;
//        }
        strings[0] = "def";
        strings[1] = "de";
        strings[2] = "fgh";


//        int queriesCount = scanner.nextInt();
 //       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[3];

//        for (int i = 0; i < queriesCount; i++) {
//            String queriesItem = scanner.nextLine();
//            queries[i] = queriesItem;
//        }
        queries[0] = "de";
        queries[1] = "lmn";
        queries[2] = "fgh";

        int[] res = matchingStrings(strings, queries);

//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(String.valueOf(res[i]));
//
//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}