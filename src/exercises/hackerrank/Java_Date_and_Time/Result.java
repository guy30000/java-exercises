package exercises.hackerrank.Java_Date_and_Time;

import java.util.Calendar;

public class Result {

    public static String findDay(int month, int day, int year) {
        //System.out.println(month + " " + day + " " + year);
        int monthT=4,  dayT=17,  yearT=1983;
        Calendar cal = Calendar.getInstance();
        cal.set(yearT,monthT,dayT);


        System.out.println(Calendar.DAY_OF_WEEK);

        return "nacho";

    }

}
