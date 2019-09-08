package org.launchcode.java.studios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B_Character_Count {


    public static void main(String[] args) {

            String textVA = "1ghjkortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
            String textVB = textVA.toUpperCase(); //This line is part of making Case insensitive, Also makes it in alphabeitcal order for some reason
            HashMap<Character, Integer> counts = new HashMap<>();
            char[] charactersInStringV = textVB.toCharArray();

            for(char charV : charactersInStringV) { //for c in charactersInString
                int xV = 1;

                boolean charIsLetterV = Character.isLetter(charV); //WOrking on making it only print letters
                boolean charIsDigitV = Character.isDigit(charV);

                if (charIsLetterV == true || charIsDigitV == true ) {
                    if(counts.containsKey(charV)) {
                        xV = counts.get(charV) + 1;
                    }
                    counts.put(charV, xV);
                }
                }



            for(char k : counts.keySet()) {
                System.out.println(k + ": " + counts.get(k));  //  This is main print statemet for this app. Commented out for other testing
            }
        }

    }


/*
        String text = "aabbcccdddeeeeeffffffgggggggg'";
        HashMap<Character, Integer> counts - new HashMap<>();
        char[] charactersInString = text.toCharArray();

        for(char c : charactersInString) {
            int x = 1;
            if (counts.containsKey(c)) {
                x = counts.get(c) + 1;

            }
                counts.put(c, x);
        }

        for(char k : counts.keySet()) {
            System.out.println(k + ": " + counts.get(k));

        }


        /*
        String string_to_count = "abcasdfdsf'";

        String alphaA ="abcdefghijklmnopqrstuvwxyz";

        for (int i = 0, n = alphaA.length(); i < n; i++) {
            char characters_A = alphaA.charAt(i);
            //System.out.println(characters_A);
            int count = 0;
            for (int ii = 0, nn = string_to_count.length(); ii < nn; ii++) {
                char characters_S = string_to_count.charAt(i);
                if (characters_A == characters_S) {
                    count = count + 1;
                }
            }
            System.out.println(characters_A +"  "+ count);
        }



    }

}
*/


