package exercises.hackerrank.Generics;
// https://www.youtube.com/watch?v=Z9uAwnz_wBA
//multible types 700
public class Arraypractice {
    public static <E> void printArray(E[] array){
        System.out.println("{");
        for (E element : array){
            System.out.println(element);
        }

    }
    public static void main(String[] args){

    }
}
