package org.launchcode.java.studios;
import java.util.HashMap;
public class B_Character_Count {


    public static void main(String[] args) {

            String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
            HashMap<Character, Integer> counts = new HashMap<>();
            char[] charactersInString = text.toCharArray();

            for(char c : charactersInString) { //for c in charactersInString
                int x = 1;
                if(counts.containsKey(c)) {
                    x = counts.get(c) + 1;
                }
                counts.put(c, x);
            }

            for(char k : counts.keySet()) {
                System.out.println(k + ": " + counts.get(k));
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


