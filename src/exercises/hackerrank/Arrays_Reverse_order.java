package exercises.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arrays_Reverse_order {

    public static void main (String[] args){
        //only here
        ArrayList<Integer> listThingy = new ArrayList<Integer>();
        listThingy.addAll(Arrays.asList(5,3,6,6,3,6,7,7));
        for (int i=listThingy.size()-1; i>=0;i--){
            System.out.print(listThingy.get(i) + " ");
        }



        //end here
        //hacker
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for (int number=0;number<n;n++){
//
//        }
        //end hacker

    }

}
