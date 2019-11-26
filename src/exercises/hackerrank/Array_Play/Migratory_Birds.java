package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Migratory_Birds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> birdCount = new HashMap<>();
        for (int i = 0;i<arr.size();i++){
          int bC=0;
                if (birdCount.containsKey(arr.get(i))){
                    bC = birdCount.get(arr.get(i)) + 1;
                    birdCount.put(arr.get(i), bC);
                } else {
                    birdCount.put(arr.get(i), 1);
                }
        }
        int maxBird=0;
        int birdID=0;
        for (int j:birdCount.keySet()) {
            if (birdCount.get(j) > maxBird) {
                birdID=j;
                maxBird=birdCount.get(j);
            }
        }
    return birdID;
    }



    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

//        for (int i = 0; i < arrCount; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr.add(arrItem);
//        }
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);


        int result = migratoryBirds(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
