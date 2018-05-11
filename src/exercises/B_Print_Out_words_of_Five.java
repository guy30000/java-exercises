package exercises;

//this is from class 2

//Write a static method to print out each word in a list that has exactly 5 letters.
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class B_Print_Out_words_of_Five {
    public static void main(String[] args) {
        //This line functions but prints wired
        //String[] wordsVA = new String [] {"test3","test4","test5"};

        ArrayList<String> wordsVS = new ArrayList<String>();
        String nachoV = "Taco";
        String s2 = "Tacos";
        String s4 = "dogs";
        String s5 = "monkey";
        String s6 = "faces";
        String s7 = "lame";
        String s8 = "stnks";
        String s9 = "done";
        wordsVS.add(nachoV);
        wordsVS.add(s2);
        wordsVS.add(s4);
        wordsVS.add(s5);
        wordsVS.add(s6);
        wordsVS.add(s7);
        wordsVS.add(s8);
        wordsVS.add(s9);

        for (String one_wordV : wordsVS) {
            //System.out.println(one_wordV);
            if (one_wordV.length()== 5) {
                System.out.println(one_wordV + ", has exactly 5 letters");
            }


        }
    }
}