package exercises.hackerrank;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Java_Arraylist {
    //int[][] nums = new int[5][5];

    public static void main(String[] Args) {
        ArrayList<Integer> sList = new ArrayList<Integer>();
        ArrayList<Integer> sList1 = new ArrayList<Integer>();
        ArrayList<Integer> sList2 = new ArrayList<Integer>();
        ArrayList<Integer> sList3 = new ArrayList<Integer>();
        ArrayList<Integer> sList4 = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> gList = new ArrayList<ArrayList<Integer>>();
        sList.addAll(Arrays.asList(11,12,13,14,15,16));
        gList.add(sList);
        sList1.addAll(Arrays.asList(4,8,2,8,8));
        gList.add(sList1);
        sList2.addAll(Arrays.asList(25,28,25,27,29));
        gList.add(sList2);
        sList3.addAll(Arrays.asList(30,38,35,36,37));
        gList.add(sList3);
        sList4.addAll(Arrays.asList(45,46,47,47,49));
        gList.add(sList4);



        for (int i=0;i< gList.size();i++) {
          //  System.out.println(gList.get(i).get(i));
        }

        //System.out.println(gList.get(1).get(4));

        try {

            System.out.println(gList.get(1).get(5));

        } catch (RuntimeException e) {
            System.out.println("broken");

        }

        //https://www.hackerrank.com/challenges/java-arraylist/problem
//        public static void main(String[] args) {
//            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//            ArrayList<ArrayList<Integer>> gList = new ArrayList<ArrayList<Integer>>();
//            Scanner scan = new Scanner(System.in);
//            int numOfLists = scan.nextInt();  // initilized glist and got total number of lists
//
//            for (int i=0;i<numOfLists;i++){
//                ArrayList<Integer> sList = new ArrayList<Integer>();
//                int numOfNums = scan.nextInt();   //initilized single list, iterating over number of lists
//                for (int j=0;j<numOfNums;j++){
//                    int singleNum = scan.nextInt();
//                    sList.add(singleNum); //adding numbers to single list
//                }
//                gList.add(sList);
//            }  // lists created
//
//            // num check start
//            int numOfChecks = scan.nextInt();
//            int lCheck = 0;
//            int nCheck = 0;
//            for (int i =0;i<numOfChecks;i++){
//                lCheck = scan.nextInt()-1;
//                nCheck = scan.nextInt()-1;
//                try{
//                    System.out.println(gList.get(lCheck).get(nCheck));
//                } catch (RuntimeException e){
//                    System.out.println("ERROR!");
//                }
//            }
//
//
//        }
//input
//        5    //this int is number of lists.
//        5 41 77 74 22 44      //first int is number of ints in list, fallowed by the ints
//        1 12
//        4 37 34 36 52
//        0
//        3 20 22 33
//        5                     //this int is numer of checks
//        1 3                   //this woudl be list num/num in list
//        3 4
//        3 1
//        4 3
//        5 5
}
}
