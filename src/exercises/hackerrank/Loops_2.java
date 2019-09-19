package exercises.hackerrank;

public class Loops_2 {

    public static void main (String[] args){
        int a = 0;
        int b = 2;
        int n = 10;


        int solution = a+1*b;
        int multiplier =2;
        for (int i = 1;i<n+1;i++){
            //System.out.println(i);
            System.out.print(solution + " ");
            int addingPart = b*multiplier;
            //System.out.println( " " + multiplier);
            multiplier= multiplier*2;
            solution += addingPart;

        }




    }


}
