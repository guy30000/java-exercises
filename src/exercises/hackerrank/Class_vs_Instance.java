package exercises.hackerrank;

import java.util.Scanner;

public class Class_vs_Instance {
// Wrote the setter to get this working. This wont work without writing input, Chnaged all fallowing "Class_vs_Instance", from "Person". Origional.
    //https://www.hackerrank.com/challenges/30-class-vs-instance/problem
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public Class_vs_Instance(int initialAge) {
        // Add some more code to run some checks on initialAge
        setAge(initialAge);
        // System.out.println(initialAge);
        if (initialAge < 0){
            System.out.println("Age is not valid, setting age to 0. " );
            setAge(0);
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct                 statement:
        if (age < 13)System.out.println("You are young." );
        if ( 13 <= age && age < 18)System.out.println("You are a teenager." );
        if (age >= 18)System.out.println("You are old." );
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Class_vs_Instance p = new Class_vs_Instance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}