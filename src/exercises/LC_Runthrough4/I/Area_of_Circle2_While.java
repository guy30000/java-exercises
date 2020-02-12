package exercises.LC_Runthrough4.I;
import java.util.Scanner;
// https://education.launchcode.org/skills-back-end-java/studios/area/
public class Area_of_Circle2_While {
    public static void main (String[] args){
        Scanner thing = new Scanner(System.in);
        double r = -1;

        while (r<0) {
            System.out.println("Enter radius");
            r = thing.nextDouble();
            if (r<0)System.out.println("Cannot be negitive");
        }
        System.out.println("Area = " + 3.14 *r*r);


    }
}
