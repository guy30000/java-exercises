package org.launchcode.java.demos.java4python;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class Gradebook {

    public static void main(String[] args) {

        ArrayList<String> studentsVV = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudentV;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudentV = in.nextLine();

            if (!newStudentV.equals("")) {
                studentsVV.add(newStudentV);
            }

        } while(!newStudentV.equals(""));

        // Get student grades
        for (String studentV : studentsVV) {
            System.out.print("Grade for " + studentV + ": ");
            Double grade = in.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int iV = 0; iV < studentsVV.size(); iV++) {
            System.out.println(studentsVV.get(iV) + " (" + grades.get(iV) + ")");
            sum += grades.get(iV);
        }

        double avgV = sum / studentsVV.size();
        System.out.println("Average grade: " + avgV);
    }

}
