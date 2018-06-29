package exercises;
// this is from class 1 // di dnot figure out ignoring case

import java.util.ArrayList;
import java.util.Scanner;
public class A_Search_Alice_In_Wonderland {

    public static void main(String[] args) {

        String alice_lineV = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";;

        System.out.println("Enter word to search");
        Scanner word_searchV = new Scanner(System.in);
        String lookUpV = word_searchV.nextLine(); //nextLine waits for next string typed


        if (alice_lineV.indexOf(lookUpV) != -1) {
            System.out.println("Found " + '"' + lookUpV + '"');
        }
        else {
            System.out.println("Did not find " + '"' + lookUpV + '"');
        }





        }
    }





