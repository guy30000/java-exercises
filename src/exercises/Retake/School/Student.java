package exercises.Retake.School;
//3.5 excersizes
public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    private String gradeLevel;





    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public String getName() {
        return name;
    }
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    private void setName(String aName) { //guessing that this can be private
        name = aName;
    }
    public Integer getStudentId() {
        return studentId;
    }

//    public void setStudentId(Integer aStudentId) {  //I think this wont work as it is a final
//        studentId = aStudentId;
//    }
    public Integer getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(Integer aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double aGpa) {
        gpa = aGpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        String pointScore = Course.getCourseGrade();
        if (pointScore == "A"){            gpa = 4;        }
        if (pointScore == "B"){            gpa = 3;        }
        if (pointScore == "C"){            gpa = 2;        }
        if (pointScore == "D"){            gpa = 1;        }
        if (pointScore == "F"){            gpa = 0;        }
        Double qualityScore = gpa * getNumberOfCredits();




    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits >= 90);{
            gradeLevel = "Senior"; }
        if (numberOfCredits <= 89);{
            gradeLevel = "Junior"; }
        if (numberOfCredits <= 59);{
            gradeLevel = "Sophomore"; }
        if (numberOfCredits <= 29);{
            gradeLevel = "Freshman"; }



        return(gradeLevel);
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }

    public boolean equals2(Object o) {

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }

    public boolean equals3(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }



}