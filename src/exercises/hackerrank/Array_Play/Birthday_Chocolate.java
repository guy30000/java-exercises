package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Birthday_Chocolate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int tot = 0;
        for (int i = 0; i<s.size()-m+1;i++){
            int test = 0;
            for (int j = i; j<i+m;j++)test += s.get(j);

            if (test == d)tot++;
        }


    System.out.println(tot);
    return tot;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

//        for (int i = 0; i < n; i++) {
//            int sItem = Integer.parseInt(sItems[i]);
//            s.add(sItem);
//        }
        //s.addAll(Arrays.asList(1,2,1,3,2));
        s.addAll(Arrays.asList(4,1));



//        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        //int d = Integer.parseInt(dm[0]);
        //int d=3;
        int d=4;
        //int m = Integer.parseInt(dm[1]);
        //int m=2;
        int m=1;

        int result = birthday(s, d, m);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}