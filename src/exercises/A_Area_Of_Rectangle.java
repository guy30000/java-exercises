package exercises;
import java.util.Scanner;
public class A_Area_Of_Rectangle {
    // this is from class 1
    public static void main(String[] args) {
        Scanner in;
        double x;
        double y;

        in = new Scanner(System.in);
        System.out.println("Length?");
        x = in.nextDouble();

        System.out.println("Width?");
        y = in.nextDouble();

        double answerV = (x * y);
        System.out.println(answerV);




    }


}



