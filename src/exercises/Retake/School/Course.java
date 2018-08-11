package exercises.Retake.School;

import java.util.ArrayList;

public class Course {
    private static ArrayList<String> currentClasses = new ArrayList<>();
    private static Double totalCredits = 0.0;
    private static Double collageCredits = 0.0;
    private static String courseGrade;



    public ArrayList<String> getCurrentClasses() {
        return currentClasses;
    }

//    public void ArrayList setCurrentClasses(ArrayList aCurrentClasses) {
//        currentClasses = aCurrentClasses;
//    }

    public Double getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Double aTotalCredits) {
        totalCredits = aTotalCredits;
    }

    public Double getCollageCredits() {
        return collageCredits;
    }

    public void setCollageCredits(Double aCollageCredits) {
        collageCredits = aCollageCredits;
    }


    public static String getCourseGrade() {
        return courseGrade;
    }

    public static void setCourseGrade(String courseGrade) {
        Course.courseGrade = courseGrade;
    }
}