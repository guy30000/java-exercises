package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_HashMap_Gradebook_mod {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner inV = new Scanner(System.in);
        int newStudentID;
        //String newName = null;

        System.out.println("Enter students ID and Name (or enter '0' to finish):");

        System.out.print("Student ID: ");
        newStudentID = inV.nextInt();

        while (newStudentID > 0) {


            if (newStudentID > 0) {
                inV.nextLine();
                System.out.print("Name: ");
                String newName = inV.nextLine();
                students.put(newStudentID, newName);
                //System.out.println("ID# " + newStudentID + " Name: " + newName);

                System.out.print("Student ID: ");
                newStudentID = inV.nextInt();

            }

        } if (newStudentID < 0);

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID# " + student.getKey() + " Name: " + student.getValue());


        }


    }

}