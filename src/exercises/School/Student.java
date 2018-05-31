package exercises.School;
//Class 5 Prep Exercises
public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;


    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        System.out.println(gpa);
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
        System.out.println(nextStudentId);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        System.out.println(courseCredits);
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits

        return("shutip");
    }

    /* getters and setters omitted */

}
