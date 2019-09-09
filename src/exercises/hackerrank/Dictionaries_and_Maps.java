package exercises.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Dictionaries_and_Maps {

public static void main (String[] args){
    Map<String, Integer> phoneBook = new HashMap<String, Integer>();
    //HashMap<String, Integer> phoneBook = new HashMap<>();
    phoneBook.put("sam", 99912222);
    phoneBook.put("tom", 11122222);
    phoneBook.put("tom", 12299933);

    //System.out.println(phoneBook.get("tom"));

    String s = "james";
    if (phoneBook.containsKey(s)){
        System.out.println(phoneBook.get(s));
    } else {
        System.out.println("Not Found");
    }




    }

}
