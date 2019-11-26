package exercises.hackerrank.Nodes.Binary_Search_Trees;

import jdk.nashorn.internal.parser.Scanner;

class Solution{

    public static int getHeight(Node root){
        //Write your code here
        //int root1 = root.data;
        System.out.println(root);
        System.out.println();
        int count=0;
        if (root != null){
            //root=root.left;
            int nextthing=getHeight(root.left);
        }
        //while (root != null){

//            if (root.left != null){
//                System.out.println( " L");
//                count++;
//                int nextthing1=getHeight(root.left);
//            }
//            if (root.right != null){
//                System.out.println(" R");
//                count++;
//                int nextthing2=getHeight(root.right);
//            }

        //}



        System.out.println(count + " count");
        return count;
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
        //Scanner sc=new Scanner(System.in);
        int T=7;
        Node root=null;
//        while(T-->0){
//            int data=sc.nextInt();
//            root=insert(root,data);
//        }
        root=insert(root,3);
        root=insert(root,5);
        root=insert(root,2);
        root=insert(root,1);
        root=insert(root,4);
        root=insert(root,6);
        root=insert(root,7);



        int height=getHeight(root);
        System.out.println(height);
    }
}