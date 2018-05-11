package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {


    public static void main(String[] args) {
        Scanner in;
        double x;

        in = new Scanner(System.in);
        System.out.println("Give me a number");
        x = in.nextDouble();
        double answer = (x * x * 3.14);
        System.out.println(answer);
    }
}