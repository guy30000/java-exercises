package exercises.hackerrank.StringPlay;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Counting_Valleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] charString = s.toCharArray();
        int vallyCount = 0;
        int elevation = 0;
         int dipFlat = 0;

        for (char charV:  charString) {
            if (elevation == -1) dipFlat = 1;
            if (charV == 'U') elevation++;
            if (charV == 'D') --elevation;
            if (elevation == 0 && dipFlat == 1) vallyCount++;
            dipFlat = 0;
        }

//        for (char charV:  charString) {
//            //if (charV == 'U') elevation++;
//            if (charV == 'D') {
//                consecCount++;
//                //elevation = elevation-1;
//                if (consecCount == 2) {
//                    vallyCount++;
//                    finalblock = 1;
//                }
//            }
//            if (charV == 'U') {
//                consecCount = 0;
//                finalblock = 0;
//            }
//        }
//        if (finalblock == 1)vallyCount=vallyCount-1;

//System.out.println(vallyCount);
    return vallyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 10;
 //       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        String s = "UDDDUDUU";

        int result = countingValleys(8, "UDUUUDUDDD");

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}
