package exercises.Retake;
//This is a complete to the other. There is no "a" of this in this folder
//This is from the video https://www.youtube.com/watch?v=ERe9GjYJ4iY. Befor changes were made to check lengths of boths Arrays Which starts at 51 minutes
import java.util.ArrayList;

public class R2b_ArrayList_Adder {
    public static void main (String[] args ){
        // "new calls constrution of object. "()" means its calling a method

        ArrayList<Integer> firstV = new ArrayList<Integer>();
        firstV.add(7);
        firstV.add(2);
        firstV.add(5);
        firstV.add(6);
        firstV.add(7);
        ArrayList<Integer> second = new ArrayList<Integer>();
        second.add(5);
        second.add(7);
        //second.add(3);
        //second.add(9);
       // second.add(9);

        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < firstV.size(); i++){
            if (i < second.size()) {
                int sum = firstV.get(i) + second.get(i);
                results.add(sum);
            } else {
                //int sum = firstV.get(sum);
                results.add(firstV.get(i));
            }
            System.out.println(results);
        }


    }

}
