package exercises.hackerrank.Array_Play.Prime_Numbers;

import java.util.ArrayList;

public class My_Prime_maker {

///this isnt really a prime maker
    static public void main (String[] args){
        int num = 9;
        ArrayList<Integer> primes = new ArrayList<>();


        for (int i = 2;i<num/2;i++){
            if (num % i != 0){
                primes.add(i);
            }
        }

        for (int pnum : primes){
            System.out.println(pnum);
        }


    }


}
