package exercises.Retake;
import java.util.ArrayList;

public class R2b_print_words_of_5 {
    public static void main(String[] args) {
        //This line functions but prints wired
        //String[] wordsVA = new String [] {"test3","test4","test5"};

        ArrayList<String> wordsVS = new ArrayList<String>();
        wordsVS.add("Tacos");
        wordsVS.add("dogs");
        wordsVS.add("monkey");
        wordsVS.add("faces");
        wordsVS.add("lame");
        wordsVS.add("stnks");
        wordsVS.add("done");



        for (String one_wordV : wordsVS) {
            //System.out.println(one_wordV);
            if (one_wordV.length()== 5) {
                System.out.println(one_wordV + ", has exactly 5 letters");
            }


        }
    }
}
