package exercises.Retake;
import java.util.ArrayList;


public class R2_print_words_of_5 {
    public static void main(String[] args) {
        //This line functions but prints wired
        //String[] wordsVA = new String [] {"test3","test4","test5"};

        ArrayList<String> wordsVS = new ArrayList<String>();
        String nachoV = "Taco";
        wordsVS.add(nachoV);
        nachoV = "Tacos";
        wordsVS.add(nachoV);
        nachoV = "dogs";
        wordsVS.add(nachoV);
        nachoV = "monkey";
        wordsVS.add(nachoV);
        nachoV = "faces";
        wordsVS.add(nachoV);
        nachoV = "lame";
        wordsVS.add(nachoV);
        nachoV = "stnks";
        wordsVS.add(nachoV);
        nachoV = "done";
        wordsVS.add(nachoV);


        for (String one_wordV : wordsVS) {
            //System.out.println(one_wordV);
            if (one_wordV.length()== 5) {
                System.out.println(one_wordV + ", has exactly 5 letters");
            }


        }
    }
}

