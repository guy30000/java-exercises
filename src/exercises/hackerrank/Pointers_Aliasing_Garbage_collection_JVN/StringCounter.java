package exercises.hackerrank.Pointers_Aliasing_Garbage_collection_JVN;

import java.util.StringTokenizer;

public class StringCounter {
    public static void main(String[] args) {
        String line = "He_ll 'o[!,?.\\'@]+";

//        Scanner scan = new Scanner(System.in);
//        String line = scan.nextLine();
//        scan.close();

        line = line.replaceAll("[\\W_]", " ");
        StringTokenizer st = new StringTokenizer(line);
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());


            // \/Paste area   //This is good but timed out.

//        line = line.replaceAll("[\\W_]", " ");
//        StringTokenizer st = new StringTokenizer(line);
//        int counter=0;
//        String finish = "";
//        System.out.println(line);
//        while (st.hasMoreTokens()){
//            counter+=1;
//            finish += ("\n"+st.nextToken());
//        }
//        System.out.println(counter+""+finish);
            // /\Paste area

        }
    }

}
