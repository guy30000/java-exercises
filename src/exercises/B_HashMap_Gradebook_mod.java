package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_HashMap_Gradebook_mod {

    public static void main(String[] args) {


        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newStudentID;
        //String newName = null;

        System.out.println("Enter students ID and Name (or enter '0' to finish):");

        System.out.print("Student ID: ");
        newStudentID = in.nextInt();

        while (newStudentID > 0) {


            if (newStudentID > 0) {
                in.nextLine();
                System.out.print("Name: ");
                String newName = in.nextLine();
                students.put(newStudentID, newName);
                //System.out.println("ID# " + newStudentID + " Name: " + newName);

                System.out.print("Student ID: ");
                newStudentID = in.nextInt();

            }

        } if (newStudentID == \n);

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID# " + student.getKey() + " Name: " + student.getValue());


        }


    }

}