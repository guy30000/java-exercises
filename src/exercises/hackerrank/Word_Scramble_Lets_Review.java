package exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Word_Scramble_Lets_Review {
    public static void main(String[] args){

        String textVB = "Hacker";
        char[] charactersInStringV = textVB.toCharArray();



//Test area
        int charcountHR =0;
        //List<String> listA=new ArrayList<String>();
        //List<String> listB=new ArrayList<String>();
        StringBuilder stringA = new StringBuilder();
        StringBuilder stringB = new StringBuilder();


        for(char singleCharHR : charactersInStringV) {
            charcountHR++;
            if (charcountHR % 2 == 1) {
                //listA.add(Character.toString(singleCharHR));
                stringA.append(Character.toString(singleCharHR));
            } else {
                //listB.add(Character.toString(singleCharHR));
                stringB.append(Character.toString(singleCharHR));
            }
        }
//        for (int i = 0;i<listA.size();i++){
//            System.out.print(listA.get(i));
//        }
//        System.out.print("  ");
//        for (int i = 0;i<listB.size();i++){
//            System.out.print(listB.get(i));
//        }
        System.out.println(stringA + " " + stringB);
    }

//    Scanner scan = new Scanner(System.in);
//    int n = scan.nextInt();
//        scan.nextLine();
//        for (int tWords = 0;tWords<n;tWords++ ){
//        String word = scan.nextLine();
//
//
//        char[] charactersInStringV = word.toCharArray();
//
//        int charcountHR =0;
//        //List<String> listA=new ArrayList<String>();
//        //List<String> listB=new ArrayList<String>();
//        StringBuilder stringA = new StringBuilder();
//        StringBuilder stringB = new StringBuilder();
//        for(char singleCharHR : charactersInStringV) {
//            charcountHR++;
//            if (charcountHR % 2 == 1) {
//                //listA.add(Character.toString(singleCharHR));
//                stringA.append(Character.toString(singleCharHR));
//            } else {
//                //listB.add(Character.toString(singleCharHR));
//                stringB.append(Character.toString(singleCharHR));
//            }
//        }
//        /*for (int i = 0;i<listA.size();i++){
//                System.out.print(listA.get(i));
//            }
//        System.out.print("  ");
//        for (int i = 0;i<listB.size();i++){
//            System.out.print(listB.get(i));
//        }
//        System.out.println();
//         */
//        System.out.println(stringA +" "+ stringB);
//    }



}
