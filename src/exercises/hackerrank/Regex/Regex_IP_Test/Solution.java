package exercises.hackerrank.Regex.Regex_IP_Test;
import exercises.hackerrank.Regex.Regex_IP_Test.MyRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.hackerrank.com/challenges/java-regex/problem
public class Solution {
//GIven
    public static void main(String[] args){
//Test to see if IP address is valid.
//        000.12.12.034
//        121.234.12.12
//        23.45.12.56
//        00.12.123.123123.123
//        122.23
//        Hello.IP

     //   Scanner in = new Scanner(System.in);
      //  while(in.hasNext()){
            String IP = "000.12.12.034";
            System.out.println(IP.matches(new MyRegex().pattern));
        }



    }

