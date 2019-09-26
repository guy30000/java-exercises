package exercises.hackerrank.DataStructures.BST_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    static void levelOrder(Node root){
    //Write your code here
        ArrayList<Integer> listA= new ArrayList<Integer>();
        LinkedList queue = new LinkedList();

        if (root!=null)
            listA.add(root.data);
            queue.add(root);
            while (queue!=null)






        for (int i =0;i<listA.size();i++){
            System.out.print(listA.get(i) + " ");
        }
        //end copy
}

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
        Node root=null;
//        while(T-->0){
//            int data=sc.nextInt();
//            root=insert(root,data);
//        }
        root=insert(root,3);
        root=insert(root,5);
        root=insert(root,4);
        root=insert(root,7);
        root=insert(root,2);
        root=insert(root,1);

        levelOrder(root);
    }
}
