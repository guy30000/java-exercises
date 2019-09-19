package exercises.hackerrank.Exception.Given;
//from part one
public class ExceptionsPractice {

    public static void main (String[] args){

        try {
            System.out.println("print this");
            int[] c = new int[5];
            System.out.println(c[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception thrown "+ e);
        } finally {
            System.out.println("This prints nomatter whay,jusy like if outside");

        }


    }
}
