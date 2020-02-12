package exercises.LC_Runthrough4.II;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main (String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner studentScan = new Scanner(System.in);
        Integer studentID;
        String studentName;


        do {
            System.out.println("Enter student ID: \n Enter 0 to when complete");
            studentID = studentScan.nextInt();
            if (studentID !=0){
                System.out.println("Student Name");
                studentScan.nextLine();
                studentName = studentScan.nextLine();
                students.put(studentID, studentName);
            }
        } while (studentID != 0);

        for (Map.Entry<Integer, String> newStudent : students.entrySet()){
        System.out.println(newStudent.getValue() + " ID:" + newStudent.getKey() );
        }


    }

}
