package exercises.hackerrank.Linked_List;
import java.io.*;
import java.util.*;
import java.util.Scanner;

class Solution {
    int count=0;
    public static  Node insert(Node head,int data) {
        //Complete this method

        if(head == null) return new Node(data);
        else if(head.next == null){
            head.next = new Node(data);
        }
        else{
            insert(head.next,data);
        }
        return head;


    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = 4;
//        while(N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head,5);
//        }
        head = insert(head,2);
        head = insert(head,3);
        head = insert(head,4);
        head = insert(head,1);

        display(head);
        sc.close();
    }
}