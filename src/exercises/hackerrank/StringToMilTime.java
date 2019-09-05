package exercises.hackerrank;

import java.util.Scanner;

public class StringToMilTime {



    public static void main (String[] args ) {
        String s = "12:05:45AM";
        char[] charV = s.toCharArray();
        //char tet = charV[8];
        String pullingHour = String.valueOf(charV[0] + "" + charV[1]);
        Integer hourConvert = Integer.valueOf(pullingHour);
        if (s.contains("PM") && !hourConvert.equals(12)) {
            System.out.println("c1");
            hourConvert += 12;
        }
        String milTime = String.valueOf(hourConvert + "" + charV[2] + "" + charV[3] + "" + charV[4] + "" + charV[5] + "" + charV[6] + "" + charV[7]);
        if (hourConvert == 12 && s.contains("AM")) {
            System.out.println("c3");
            milTime = String.valueOf("00" + charV[2] + "" + charV[3] + "" + charV[4] + "" + charV[5] + "" + charV[6] + "" + charV[7]);
        }
        if (hourConvert < 10) {
            System.out.println("c2");
            milTime = String.valueOf("0" + hourConvert + "" + charV[2] + "" + charV[3] + "" + charV[4] + "" + charV[5] + "" + charV[6] + "" + charV[7]);
        }


        System.out.println(milTime);

///SKipp Scanner
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        Double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();


    }
}
