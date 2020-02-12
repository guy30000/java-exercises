package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
//This one was fun because I figured it out but had to change it to save time. Had to refactor to better efficiency

public class Electronics_Shop {


    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int[] totals = new int[drives.length * keyboards.length];
        int price = -1;
        int totPosition = 0;

        for (int k=0;k<keyboards.length;k++){
            for (int d =  0;d<drives.length;d++){
                totals[totPosition]=(keyboards[k]+drives[d]);
                if (b-totals[totPosition]==0) return b;
                if (b-totals[totPosition]>0 && b-totals[totPosition]<b-price) price=totals[totPosition];
                totPosition++;
            }
        }
        System.out.println(price);
        return price;
    }
//        for (int p=0;p<totals.length;p++){
//            while (tempPriceSet == 0) {
//                for (int pp = 0; pp < totals.length; pp++) {
//                    tempPriceSetLoop++;
//                    if (b - totals[pp] >= 0 && tempPriceSet == 0) {
//                        tempPrice = totals[pp];
//                        tempPriceSet = 1;
//                        break;
//                    }
//                }
//                if (tempPriceSetLoop == b+1)return -1;
//            }
//            if ((totals[p]<=b) && (b-totals[p]>=0) && (b-totals[p]<b-tempPrice) && (tempPriceSet ==1)){
//                tempPrice = totals[p];
//                price = totals[p];
//            }
//        }
        //above is part of origional code refactored


    //below is something to research
//        from itertools import product  //This to be moved to import while working with it.
//
//        def getMoneySpent(keyboards, drives, b):
//        return max([t for t in map(sum, product(keyboards, drives)) if t <= b] or [-1])


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] bnm = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        //int b = Integer.parseInt(bnm[0]);
        int b = 10;
       // int n = Integer.parseInt(bnm[1]);
        int n = 3;
        //int m = Integer.parseInt(bnm[2]);
        int m = 3;

        int[] keyboards = new int[n];
        keyboards[0] = 2;
        keyboards[1] = 8;
        keyboards[2] = 0;


//        String[] keyboardsItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
//            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
//            keyboards[keyboardsItr] = keyboardsItem;
//        }

        int[] drives = new int[m];
        drives[0] =5;
        drives[1] = 1;
        drives[2] = 15;

//        String[] drivesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
//            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
//            drives[drivesItr] = drivesItem;
//        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

//        bufferedWriter.write(String.valueOf(moneySpent));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}
