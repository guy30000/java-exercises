package exercises.hackerrank.Generics;
///Also see Queuey //linked list too at 2000
public class Generics {

    public static <T extends  Comparable <T>> T findMax(T a, T b) { //1130
    int n =a.compareTo(b);
    if (n<0){
        return b;
    } else {
        return a;
    }
    }


    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));
        System.out.println(findMax('a', 'e'));
        System.out.println(findMax("jeep", "poot"));
        System.out.println(findMax(3.43, 2.343));

        Generics k = new Generics(); //1600 comparable

    }
}
