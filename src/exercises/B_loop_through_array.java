package exercises;
//Part of lesson 2. Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8. Then loop through the array and print out each value.

public class B_loop_through_array {
    public static void main(String[] args) {

        int[] numbersV = {1, 1, 2, 3, 5, 8};
        for (int one_intV : numbersV) {

            System.out.println(one_intV);
        }


    }


}
