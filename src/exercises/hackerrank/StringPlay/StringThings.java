package exercises.hackerrank.StringPlay;

public class StringThings {
    public static void main (String[] args){
        String A="hello";
        String B="java";
//
        String lex = "No";
        int j= A.length();
        int k= B.length();
        int line1 = j+k;
        char charA = A.charAt(0);
        char charB = B.charAt(0);
        if (charA > charB)  lex = "Yes";
        A= A.substring(0, 1).toUpperCase() + A.substring(1);
        B=B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(line1 +"\n" + lex + "\n" + A + " "+ B);
    }
}
