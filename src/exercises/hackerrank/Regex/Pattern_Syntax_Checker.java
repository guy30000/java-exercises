package exercises.hackerrank.Regex;

import jdk.nashorn.internal.parser.Scanner;

import java.util.regex.Pattern;
// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?h_r=next-challenge&h_v=zen
// Trying Patter REgex
// On test had to chagne While loop to for loop. The while loop doesnt work. (Actually looks like I needed  testCases--

public class Pattern_Syntax_Checker

///  Test patterns
//      ([A-Z])(.+)
//        [AZ[a-z](a-z)
//        batcatpat(nat


{
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases>0){
           String pattern = "([A-Z])(.+)";
            //Write your code

        try {
            Pattern test = Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (java.util.regex.PatternSyntaxException e) {
            System.out.println("Invalid");
        }







        }
    }
