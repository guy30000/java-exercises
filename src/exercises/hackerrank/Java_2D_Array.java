package exercises.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_2D_Array {
    Scanner scan = new Scanner(System.in);
    BigInteger intOne = new BigInteger(scan.nextLine());
//This will not function. This is just an illistration of pulling doule arrays out

//    private static final Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        int[][] arr = new int[6][6];
//
//        Scanner scanner;
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
//
//        scanner.close();
//        int topHG=(arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2]);
//        int testHG=topHG;
//        for (int p = 0;p<(arr.length-2) ;p++){
//
//            for (int pp = 0;pp<(arr[p].length-2) ;pp++){
//                testHG=(arr[p][pp] + arr[p][pp+1] + arr[p][pp+2]
//                        + arr[p+1][pp+1] +
//                        arr[p+2][pp]+ arr[p+2][pp+1] + arr[p+2][pp+2]);
//
//                if (testHG>topHG){
//                    topHG=testHG;
//                }
//            }
//
//        }
//        System.out.println(topHG);
//    }
}
