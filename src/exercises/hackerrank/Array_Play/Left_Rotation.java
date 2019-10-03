package exercises.hackerrank.Array_Play;

import jdk.nashorn.internal.parser.Scanner;

public class Left_Rotation {

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //String[] nd = scanner.nextLine().split(" ");


        //int n = Integer.parseInt(nd[0]);
        int n=5;


        //int d = Integer.parseInt(nd[1]);
        int d = 4;



        int[] a = new int[n];

        //String[] aItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //for (int i = 0; i < n; i++) {
            //int aItem = Integer.parseInt(aItems[i]);
            //a[i] = aItem;
        //}

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        //scanner.close();
        //copy one
//            if (d > a.length) d = a.length % d;   //n=total numbers, d = moves to left
//            int[] tampA = a.clone();  //notice the clone
//            for (int i = 0; i < a.length ; i++) {
//               int move = i - d;
//               if (move<0) move = move+ a.length;
//                a[move] = tampA[i];
//            }
//        for (int i = 0; i < a.length ; i++)System.out.print(a[i] + " ");
//end copy area            //v another way to do it
        int[] tampA = new int[n*2];
        for (int i = 0; i < n ; i++){
            tampA[i]=a[i];
            tampA[i+n]=a[i];
        }
        for (int i = 0; i < a.length ; i++){
            a[i]=tampA[i+d];
        }
        for (int i = 0; i < a.length ; i++)System.out.print(a[i] + " ");
///endy copy 2
    }
}