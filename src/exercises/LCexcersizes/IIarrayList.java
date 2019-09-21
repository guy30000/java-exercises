package exercises.LCexcersizes;

import java.util.ArrayList;

public class IIarrayList {


    static public void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(9);
        nums.add(5);
        nums.add(2);
        nums.add(3);
        nums.add(6);
        nums.add(4);
        int sumOfEven = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                sumOfEven += nums.get(i);
            }

        }
        System.out.println(sumOfEven);
    }
}

