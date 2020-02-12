package exercises.LC_Runthrough4.I;

import java.util.Scanner;

public class Area_of_Circle3_doWhile {
    public static void main (String[] args) {
        Scanner thing = new Scanner(System.in);
        double r=0;
        do {
            if (r<0)System.out.println("Cannot be negitive");
            System.out.println("Enter Radius");
            r=thing.nextDouble();

        } while (r<0);
        System.out.println("Area = " + 3.14*r*r);
    }
}