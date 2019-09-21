package exercises.LCexcersizes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IIhashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String sName;
        int sID=0;




        do{
            System.out.println("Enter student name (or ENTER to finish):");
            sName = in.nextLine();

            if (sName.equals(""))break;

            if (!sName.equals("")){
                System.out.println("Enter student ID (or ENTER to finish):");
                sID = in.nextInt();
            }
            students.put(sName, sID);
            in.nextLine();

        } while (!sName.equals(""));  ///This ends the do using its {}

        //for (int i=0;i<students.size();i++){
        System.out.println("Name | ID");
        for (Map.Entry<String, Integer> singleSt : students.entrySet()){
            System.out.println(singleSt.getKey() + " - " + singleSt.getValue());
        }



        // Get student names and grades
//        do {
//
//            System.out.print("Student: ");
//            newStudent = in.nextLine();
//
//            if (!newStudent.equals("")) {
//                System.out.print("Grade: ");
//                Double newGrade = in.nextDouble();
//                students.put(newStudent, newGrade);
//
//                // Read in the newline before looping back
//                in.nextLine();
//            }
//
//        } while(!newStudent.equals(""));
//
//        // Print class roster
//        System.out.println("\nClass roster:");
//        double sum = 0.0;
//
//        for (Map.Entry<String, Double> student : students.entrySet()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
//        }
//
//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);
    }

}

