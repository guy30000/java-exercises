package exercises;
import java.util.ArrayList;
import java.util.Scanner;
// this is from class 2
//Write a static method to find the sum of all the even numbers in a list. Within main, create a list with at least 10 integers and call your method on the list.
public class B_Sum_Of_Even {


    public static void main(String[] args) {

        int[] numbersV = {4,6,7,43,3,55,66,7};
        int y = 0;
        for(int ooneintV : numbersV) {

            int x = ooneintV % 2;
            if ((ooneintV % 2) == 0)  {
                y = ooneintV + y;

                }

            }
        System.out.println("Total of Even is " + y);


    }


}


