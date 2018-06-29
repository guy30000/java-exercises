package exercises.Retake;
import java.util.Scanner;

public class R1_Area_Of_Rectangle {


    public static void main(String[] args) {
        Scanner user_prompt_variable;
        double length_variable;
        double width_variable;


        user_prompt_variable = new Scanner(System.in);
        System.out.println("Length?");
        length_variable = user_prompt_variable.nextDouble();

        System.out.println("Width?");
        width_variable = user_prompt_variable.nextDouble();

        double answerV = (length_variable * width_variable);
        System.out.println("Area = " + answerV);
    }
}