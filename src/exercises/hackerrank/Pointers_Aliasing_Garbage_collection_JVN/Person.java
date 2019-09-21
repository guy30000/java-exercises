package exercises.hackerrank.Pointers_Aliasing_Garbage_collection_JVN;
// https://www.youtube.com/watch?v=1IAIu0Dbys8
// 500 enum
// 830 Aliases
//stuff about templates. Doesnt look important. Instructios specific to beans
//import static exercises.hackerrank.Pointers_Aliasing_Garbage_collection_JVN.HairColor.BLONDE;
import static exercises.hackerrank.Pointers_Aliasing_Garbage_collection_JVN.HairColor.*;  // Compaired with line above

public class Person {


    HairColor hairColor = BLACK;

    public Person(){

    }

    public  static void main(String[] args){
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        System.out.println("Hair color of pp " + peterParker.hairColor + " " + spiderMan.hairColor);
        peterParker.hairColor = PINK;
        System.out.println("Hair color of pp " + peterParker.hairColor + " " + spiderMan.hairColor);



    }
}
