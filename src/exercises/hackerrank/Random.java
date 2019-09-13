package exercises.hackerrank;

import java.util.Scanner;

public class Random {

    public static void main(String[] Args) {
///SKipp Scanner
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        Double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();

//// between ints
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        if ((N % 2 == 1) || (6<=N && N <=20)){
//            System.out.println("Weird");
//        } else if ((2<=N&&N<=5) || (20<N)) {
//            System.out.println("Not Weird");
//        }

        //Rounding
//        double totCost=((meal_cost)+(meal_cost*tip_percent/100)+                        (meal_cost*tax_percent/100));
//        System.out.println(Math.round(totCost));


//sub arrays
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum = sum + a[k];
//                }
//                if (sum < 0) {
//                    numNegativeSubarrays++;
//                }

//Scanning end of file
        Scanner scan = new Scanner(System.in);
        int cnt=0;
        while(scan.hasNextLine()){
            System.out.println(++cnt + " " + scan.nextLine());  //learned the ++cnt prints the current value but adds one to it.
        }









            }
        }
