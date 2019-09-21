package exercises.LCexcersizes;

import java.util.ArrayList;

public class IIarrayLists_and_Strings {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("jack");
        words.add("jackd");
        words.add("potato");
        words.add("nacho");
        words.add("monkey");
        words.add("face");

        for (int i = 0;i<words.size();i++){
            if (words.get(i).length() ==5){
                System.out.println(words.get(i) );
            }
        }

    }
}
