package exercises.LC_Runthrough4.II;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Characters_FromFile {
    public static void main (String[] args) throws FileNotFoundException {

        File filePractice = new File ("CountingCharsTxtfile.txt");
        Scanner s = new Scanner(filePractice);


        Scanner scannedString = new Scanner(System.in);
        HashMap<Character, Integer> charCount = new HashMap<>();

        String theString = s.nextLine();
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
