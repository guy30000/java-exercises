package exercises.hackerrank.Exception;

import java.util.Scanner;

public class Exc_String_to_Integer {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String S = in.next();  //given
        String S = "gf"; //replaces given

        try {
            int toInt = Integer.parseInt(S);
            System.out.println(toInt);
        } catch (NumberFormatException b){
            System.out.println("Bad String");
        }



    }

}
