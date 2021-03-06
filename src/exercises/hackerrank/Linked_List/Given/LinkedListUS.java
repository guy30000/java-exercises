package exercises.hackerrank.Linked_List.Given;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class LinkedListUS {
    //propertoes
    Node head;
    int count;

//    public LinkedList(){ //1900
//        head = null;
//        count = 0;
//    }

    public  LinkedListUS(Node newHead){
        head = newHead;
        count = 1;
    }

    public void add(int newData){
        Node temp= new Node(newData);
        Node current = head;
        while(current.getNext() != null) current = current.getNext();
        current.setNext(temp);
        count++;
    }

    public int get(int index){
        if (index <=0){return -1;}
        Node current = head;
        for (int i =1;i<index;i++){
            current = current.getNext();
                    }
        return current.getData();
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void remove() {
        Node current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args){
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        linkedlist.add("TIng");
        System.out.println(linkedlist);
    }
}
