package exercises.LC_Runthrough4.II;
import java.lang.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Characters {
    public static void main (String[] args){
        Scanner scannedString = new Scanner(System.in);
        HashMap<Character, Integer> charCount = new HashMap<>();

        System.out.println("Enter String");
        String theString = scannedString.nextLine();
        char[] stringChars = theString.toCharArray();
        Arrays.sort(stringChars);

        for (char charA: stringChars){
            if (!Character.isLetter(charA))continue;
            if (charCount.containsKey(charA)){
                charCount.put(charA, charCount.get(charA)+1);
            } else{charCount.put(charA,1);}
        }

        for (Map.Entry<Character, Integer> finalCount : charCount.entrySet()){
            System.out.println(finalCount.getKey() + " - "+ finalCount.getValue());
        }

    }
}
