package exercises.hackerrank.Generics;

public class Printer {


    public static <Q> void printArray(Q[] array) {

        for (Q thing:array){
            System.out.println(thing);
        }

    }
}
