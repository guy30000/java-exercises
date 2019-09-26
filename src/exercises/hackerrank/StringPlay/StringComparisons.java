package exercises.hackerrank.StringPlay;

import java.util.Scanner;
// https://www.hackerrank.com/challenges/java-string-compare/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
public class StringComparisons {


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String test = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        //String endSubstring = "nacho".substring(0,3);

        for (int i =0;i<s.length()-k+1;i++){

            test = s.substring(i, i+k);
            int lo = test.compareTo(smallest);
            int hi = test.compareTo(largest);
            if (lo<0)smallest=test;
            if (hi>0)largest=test;

        }



        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcometojava";
        int k = 3;
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
