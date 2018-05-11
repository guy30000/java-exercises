package exercises;
// this is from class 1
public class A_arrayMaxV_walkthrough {

    public static int findMaxV (int[] arrayV) {
        int maxV = arrayV[0];
        for(int i = 0; i <  arrayV.length; i++) {
            if(arrayV[i] > maxV) {
                maxV =arrayV[i];
            }
        }
        return maxV;
    }

    public static void main (String[] args){
        int[] x = {4,6,3,7,7,8,66,3,5,6,};
        int answer = findMaxV(x);
        System.out.println(answer);
    }
}