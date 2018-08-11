package exercises;

import java.util.ArrayList;

public class B_Adds_two_array_lists {

    public static void main(String[] args) {
                                                // second Integer isnt needed

        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);
        ArrayList<Integer> second = new ArrayList<Integer>();
        second.add(1);
        second.add(6);
        second.add(3);



        ArrayList<Integer> result = new ArrayList<Integer>();

        int length = second.size();
        if(first.size() > second.size()) {
            length = first.size();
        }

        for(int i = 0; i < length; i++) {
            if(i < second.size() && i < first.size()) {
                int sum = first.get(i) + second.get(i);
                result.add(sum);
            } else if(i < first.size()) {
                //int sum = first.get(i);
                result.add(first.get(i));
            } else if(i < second.size()) {
                result.add(second.get(i));
            }
        }

        System.out.println(result);
    }

}








        /*/  This code works stop every thing to Array statements aboe and activate the below /*
        for (int i = 0; i < first.size(); i++) {
            if (i < second.size()){
                int sum = first.get(i) + second.get(i);
                result.add(sum);
            } else {
                int sum = first.get(i);  //I can remove this line and chenge the next too...
                result.add(sum); //result.add(first.get(i));



            }

        }
        System.out.println(result);


    }
}
*/