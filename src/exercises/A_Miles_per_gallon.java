package exercises;
import java.util.Scanner;
public class A_Miles_per_gallon {
// this is from class 1

    public static void main(String[] args) {
        Scanner inputV;
        Scanner inputVV;
        double milesV;
        double gasV;

        inputV = new Scanner(System.in);
        System.out.println("Miles Driven?");
        milesV = inputV.nextDouble();

        inputVV = new Scanner(System.in);
        System.out.println("Gas consumed?");
        gasV = inputVV.nextDouble();

        double answerV = (milesV / gasV);
        System.out.println("You get " + answerV + "MPG");

    }
}
