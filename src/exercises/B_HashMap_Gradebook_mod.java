package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_HashMap_Gradebook_mod {

    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID#: ");
                Double id_numV = in.nextDouble();
                students.put(newStudent, id_numV);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));
        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " #" + student.getValue());
            sum += student.getValue();
        }

    }

}