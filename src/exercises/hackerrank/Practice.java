package exercises.hackerrank;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Practice {
    private double accountBalance;

    ///Getter n Setter
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Practice(double balance) {

        int test = 37;
        Math.round(test);
    }
// Rounding
    public static void main(String[] args) {
        int num = 52;
        if (num % 5 > 2.5) num = num + (5 - num % 5);
        System.out.println("Rounding up to nearest 5------(only up) " + num);


////Kangaroo hops
        int x1=0; //pos1
        int v1=8;  //distance1
        int x2=5;  //pos2
        int v2=3;   //distance2
        //copy begins here
//        boolean samePlace = false;   // This is the wrong method for the problem but keeping because its good.
//        while (x1<=10000 && x1>=0) {    ///Kangaroos x is position, v is length of hops. This is written so I coudl make them land on same space. Basacally lowest common denominator
//            int testX2 = x2;
//            while (testX2 <= 10000 && testX2 >= 0) {
//                if (testX2 == x1) {
//                    samePlace = true;
//                    break;
//                }else if (testX2 != x1) {
//                    testX2 += v2;
//                }
//            }
//            if (testX2 == x1) {
//                samePlace = true;
//                break;
//            }
//            x1+=v1;
//        }
////Kangaroo hops Corrected
        String samePlace="NO";
        while ((x1<=100000000 && x1>=0) || (x2<=100000000 && x2>=0)){  //Raised number so high as their are no well defined limits.
            if (x2==x1){
                samePlace="YES";
                break;
            } else {
                x1+=v1;
                x2+=v2;
            }
        }
        System.out.println(samePlace);
        ///copy ends
////Printing day of week from date



    int month=9,  day=17,  year=2019;   ///do not copy
///This works but assignment wont accept it
//        LocalDate currentDate = LocalDate.of(year, month, day);
//        DayOfWeek dow = currentDate.getDayOfWeek();
//        System.out.println(dow+ " D");

// this is what they wanted
        List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);

        System.out.println(s);
//////
/////////////Currency converter
        Scanner scanner = new Scanner(System.in);
        double payment = 1000.40;
        //scanner.close();
/////copy
        // Write your code here.
///Currancyt converter. This worked but wasnt accepted by the tester
        Locale usCF = new Locale("en", "US");
        NumberFormat usCFormat = NumberFormat.getCurrencyInstance(usCF);
        String us = usCFormat.format(payment);
//india
        NumberFormat df = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("Rs.");
        dfs.setGroupingSeparator('.');
        dfs.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) df).setDecimalFormatSymbols(dfs);
        String india = (df.format(payment));


        Locale chCF = new Locale("zh", "CN");
        NumberFormat chCFormat = NumberFormat.getCurrencyInstance(chCF);
        String china = chCFormat.format(payment);


        Locale nfCF = new Locale("fr", "FR");
        NumberFormat nfCFormat = NumberFormat.getCurrencyInstance(nfCF);
        String france = nfCFormat.format(payment);

        System.out.println( us + " -US");
        System.out.println( india + " -In");
        System.out.println( china + " -Ch");
        System.out.println( france + " -NF");
//This did work

//        Locale indiaLocale = new Locale("en", "IN");
//
//        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
//        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//        System.out.println("US: "     + us.format(payment));
//        System.out.println("India: "  + india.format(payment));
//        System.out.println("China: "  + china.format(payment));
//        System.out.println("France: " + france.format(payment));



//            Scanner scan = new Scanner(System.in);
//            int q = scan.nextInt();
//            while (q-- > 0) {
//                int n = scan.nextInt();
//                int leap = scan.nextInt();
//
//                int[] game = new int[n];
//                for (int i = 0; i < n; i++) {
//                    game[i] = scan.nextInt();
//                }
//            }
//            scan.close();

/// Fun sith strings. Fisrt character to upper case. Puling first character and comparing them


///sees Greatest substring Lexicon

        



    }

}



