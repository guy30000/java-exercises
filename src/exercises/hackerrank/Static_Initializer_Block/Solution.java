package exercises.hackerrank.Static_Initializer_Block;

import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    static int H = scan.nextInt();
    static int B = scan.nextInt();
    static boolean flag=false;
    static {
//        if (H < 0 || B < 0){
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//            boolean flag=false;
//        } else {
//            boolean flag=true;
//        }
//   Dont get why above doesnt work and below does
        if(B>0 && H>0)
            flag=true;
        else
        {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }



    }









    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class