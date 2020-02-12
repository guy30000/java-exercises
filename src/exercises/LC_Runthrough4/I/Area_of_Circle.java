package exercises.LC_Runthrough4.I;

import java.util.Scanner;
// https://education.launchcode.org/skills-back-end-java/studios/area/
public class Area_of_Circle {
    public static void main (String[] args){
        Scanner thing = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = thing.nextDouble();
        if (r<0){
            System.out.println("Can't be negitive, jerk");
            System.exit(0);
        } else {
            double area = 3.14*r*r;
            System.out.println("Area = " + area);
        }
    }

}
