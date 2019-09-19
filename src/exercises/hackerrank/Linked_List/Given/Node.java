package exercises.hackerrank.Linked_List.Given;

public class Node {
    //properties
    Node next;
    int data;

    public Node(int newData){
        data = newData;
        next=null;
    }

    public Node(int newData, Node newNext){
        data=newData;
        next= newNext;
    }


    //gets n sets

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int newData) {
        this.data = newData;
    }
}
