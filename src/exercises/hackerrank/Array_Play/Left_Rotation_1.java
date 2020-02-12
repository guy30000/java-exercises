package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//Updated from Other Left Rotation. Used same stratigy but used better cod mode to move to intellJ

public class Left_Rotation_1 {

    static int[] rotLeft(int[] a, int d) {
    int[] newA= new int[a.length];
    int[] calcArray = new int[a.length *2];


    for (int i = 0;i<a.length;i++){
        calcArray[i] = a[i];
        calcArray[i+a.length] = a[i];
    }
    for (int i = 0;i<a.length;i++){
        newA[i] = calcArray[i+d];
        System.out.println(newA[i]);
    }


    return newA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] nd = scanner.nextLine().split(" ");

        int n = 5;


        int d =4;

        int[] a = new int[n];
        a[0] =1;
        a[1] =2;
        a[2] =3;
        a[3] =4;
        a[4] =5;


//        a[0] =41;
//        a[1] =73;
//        a[2] =89;
//        a[3] =7;
//        a[4] =10;
//        a[5] =1;
//        a[6] =59;
//        a[7] =58;
//        a[8] =84;
//        a[9] =77;
//        a[10] =77;
//        a[11] =97;
//        a[12] =58;
//        a[13] =1;
//        a[14] =86;
//        a[15] =58;
//        a[16] =26;
//        a[17] =10;
//        a[18] =86;
//        a[19] =51;



//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }

        int[] result = rotLeft(a, d);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}