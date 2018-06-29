package exercises.Retake;
import java.util.Scanner;
public class R1_Miles_per_gallon {



        public static void main(String[] args) {
            Scanner user_prompt_variable;
            double miles_Driven_variable;
            double gas_used_variable;


            user_prompt_variable = new Scanner(System.in);
            //user_prompt_variable.nextDouble() = new Scanner(System.in);
            System.out.println("How many miles did you drive?:");
            miles_Driven_variable = user_prompt_variable.nextDouble();  //nextDouble waits for next number unput



            System.out.println("Gas used?:");
            gas_used_variable = user_prompt_variable.nextDouble();

            double answerV = (miles_Driven_variable / gas_used_variable);
            System.out.println("MPG = " + answerV);
        }
    }

