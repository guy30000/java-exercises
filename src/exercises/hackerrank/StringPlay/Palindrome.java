package exercises.hackerrank.StringPlay;

public class Palindrome {
    public static void main(String[] args) {
        String A = "madam";

        //copy box
        String plndrne = "Yes";
        int lngthofString = A.length() / 2;
        for (int i = 0; i < lngthofString; i++){
            if (A.charAt(i)!=A.charAt(A.length()-i-1))plndrne = "No";
        }


        System.out.println(plndrne);
        //end copy


    }
}
