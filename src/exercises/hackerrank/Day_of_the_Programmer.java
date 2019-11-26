package exercises.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Day_of_the_Programmer {
    // Complete the dayOfProgrammer function below.
//Julian <1919
        //Leap years divisiable by 4
// Gregorian tranaction occured in 1918. Went from 1/31-2/14
        //Leap years divisiable by 4 and not 100
        //Leap years divisiable by 400
    //find 256th day of each year 1700-2700 depending on input //Non leap year == 13.09.xxxx
    static String dayOfProgrammer(int year) {
        //year = 2100;
        //copy
        String finalDate = ("13.09." + year);
        if(year==1918)finalDate="26.09.1918";

//        if (year < 1918 && year % 4==0)finalDate=("12.09." + year);
//        if (year > 1918 &&  year % 400 == 0)finalDate=("12.09." + year);  //leap
//        if (year > 1918 && year % 4 == 0 && year % 100 != 0) finalDate=("12.09." + year);  //leap

        if ((year < 1918 && year % 4==0) || (year > 1918 &&  year % 400 == 0) || (year > 1918 && year % 4 == 0 && year % 100 != 0))finalDate=("12.09." + year);


    System.out.println(finalDate);
    return finalDate;
    //end copy
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(2016);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
