package exercises.hackerrank.Regex.Regex_IP_Test;
// https://www.javatpoint.com/java-regex
// https://stackoverflow.com/questions/7861689/checking-a-number-range-with-regular-expressions

// https://www.rexegg.com/regex-quickstart.html#quantifiers
import java.util.regex.Pattern;

public class test {

    public static void main (String[] args){

        String pattern = "192.168.0.2";
        String pattern2 = "021.255.255.255";
       // System.out.println(Pattern.matches("\\d\\d\\d\\D.\\d\\d\\d", "413r.444"));
       // System.out.println(Pattern.matches("\\d\\d\\d\\D.\\d\\d\\d", "413r.444"));
        //System.out.println(Pattern.matches("[a-zA-Z0-9]{9}", "kkvarun32")); // all characters but max of 9

//        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
//        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
//        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true

        System.out.println(Pattern.matches("[0-255]{0,3}.[0-255]{0,3}.[0-255]{0,3}.[0-255]{0,3}", "055.255.255.255")); //<<<<
        //System.out.println(Pattern.matches("[0-255]{3}.[0-255]{3}.[0-255]{3}.[0-255]{3}", pattern2));
        //System.out.println(Pattern.matches("^(2[0-4]|1[0-9]|[1-9])$", "25"));  //24 hours
        System.out.println(Pattern.matches("[0-9]{0,3}|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]", "125"));
        //System.out.println(Pattern.matches("^([01][0-9][0-9]|2[0-4][0-9]|25[0-5])$", "001")); //000..255:




        //System.out.println(Pattern.matches("^25[0-5]$", "215"));





        //System.out.println(Pattern.matches("..s", "s"));//false (has more than 2 char)




    }

}
