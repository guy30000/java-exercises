package exercises.hackerrank.Inheritance.Abstract_Classes;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = "Nacho man";
        String author = "Homer SImpson";
        int price = 42;
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}