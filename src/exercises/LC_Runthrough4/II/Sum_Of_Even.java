package exercises.LC_Runthrough4.II;

public class Sum_Of_Even {
    public static void main (String[] args){
        int[] numList = new int[10];

        numList[0] = 5;
        numList[1] = 764;
        numList[2] = 243;
        numList[3] = 34;
        numList[4] = 34;
        numList[5] = 65;
        numList[6] = 43;
        numList[7] = 43;
        numList[8] = 76;
        numList[9] = 56;
        int evenSum=0;

        for (int i = 0;i<numList.length;i++){
            if (numList[i] %2==0)evenSum+=numList[i];
        }
        System.out.println(evenSum);

    }
}
