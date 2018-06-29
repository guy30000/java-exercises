package exercises;
// this is from class 1
public class A_arrayMaxV_walkthrough {
    //created with video https://www.youtube.com/watch?v=lnBG2fBxLH8

    public static int findMaxV (int[] arrayV) { //this is defining what this class does.
        // * void (means returning nothing)
        // * * int (because returning intergers)
        //* * * * array of integers Variable nabe

        int maxV = arrayV[0];
        for(int i = 0; i <  arrayV.length; i++) { //i starts at 0 and adds one each time
            if(arrayV[i] > maxV) {
                maxV =arrayV[i];
            }
        }
        return maxV;
    }

    public static void main (String[] args){ //this is just a method to test the above//Main means that this is what runs first
        //main method should be short. Should call other methods
        int[] x = {4,6,3,7,7,8,66,3,5,6,556};
        // Alternative to lane above
            //int[] x = new int[10];
            //x = {4,6,3,7,7,8,66,3,5,6,556};
        int answer = findMaxV(x);
        System.out.println(answer);
        //alternative to above 2 lines
        //System.out.println(findMaxV(x));
    }
}