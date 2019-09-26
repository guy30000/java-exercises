package exercises.hackerrank.StringPlay;

import jdk.nashorn.internal.parser.Scanner;

import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Boolean answer= false;
        char tempArray1[] = a.toLowerCase().toCharArray();
        char tempArray2[] = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(tempArray2);
        java.util.Arrays.sort(tempArray1);
        if (java.util.Arrays.equals(tempArray1, tempArray2))answer=true;




        return answer;
    }

    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
        String a = "anagram";
        String b = "margana";
        //scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



