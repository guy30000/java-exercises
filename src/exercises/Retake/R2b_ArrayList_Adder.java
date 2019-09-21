package exercises.Retake;
//This is a complete to the other. There is no "a" of this in this folder
//This is from the video https://www.youtube.com/watch?v=ERe9GjYJ4iY. Befor changes were made to check lengths of boths Arrays Which starts at 51 minutes
import java.util.*;
import java.text.SimpleDateFormat;


public class R2b_ArrayList_Adder {
    public static void main (String[] args ){
        // "new calls constrution of object. "()" means its calling a method

        ArrayList<Integer> firstV = new ArrayList<Integer>();
        firstV.add(7); firstV.add(2); firstV.add(5); firstV.add(6); firstV.add(7);
        ArrayList<Integer> second = new ArrayList<Integer>();
        second.add(5); second.add(7); second.add(3); second.add(9); second.add(9);

        ArrayList<Integer> results = new ArrayList<>();

        int sumplay = 0; ///this is from taking a test
        for (int i = 0; i < firstV.size(); i++){
            if (firstV.size() == second.size()) {
                int sum = firstV.get(i) + second.get(i);
                results.add(sum);
                //System.out.println(sum  + " this thing"); .. muted for testing

            } else {
                //int sum = firstV.get(sum);
                System.out.println("error");
            }
        }


        for (int j = 0; j < firstV.size(); j++) {
            sumplay += firstV.get(j);
//            System.out.println(sumplay + " sumplay thing");
        }
//        System.out.println(sumplay + " final sum");

        List<ArrayList> combined = new ArrayList<ArrayList>();
        combined.add(firstV); combined.add(second);

        for (int i = 0; i < combined.size(); i++) {
            ArrayList<Integer> row = combined.get(i);

            for (int j = 0; j < row.size(); j++){
//            System.out.println(spot.get(j));
            }
        }
        int test = -5;
        //System.out.println(Math.abs(test));
//        System.out.println("Did not find " + "\n" +   "sdfgsfdgfsdgfdsg");
//        System.out.println((6 - 2)+""+(4 -5));


        ArrayList<Integer> tes55gggt = new ArrayList<Integer>();









    }



}
