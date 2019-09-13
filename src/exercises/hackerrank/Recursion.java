package exercises.hackerrank;

public class Recursion {

    public static int Summation(int n) {
    if (n <=0){
        return n;
    } else {
        return n+Summation(n-1);
    }

    }

    public static int Factorial(int n){
        if (n<=1){
            return  1;
        } else{
            return n*Factorial(n-1);
        }

    }

    public static int exponentiation(int n, int p){
        if (p <=0){
            return 1;
        } else {
            return n*exponentiation(n,p-1);
        }
    }



    public static void main(String[] args){
        System.out.println(Factorial(3));
        int q = exponentiation(3,3);
        System.out.println(q);


    }
}
