package exercises.hackerrank.DataStructures.Binary_Search_Trees;


import exercises.hackerrank.DataStructures.Binary_Search_Trees.Node;

public class Solution {


    public static int getHeight(Node root){
        //Write your code here
        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }
       //System.out.println(heightLeft + "  "+heightRight);


        return (heightLeft > heightRight ? heightLeft : heightRight);
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
        //int T=sc.nextInt();
        Node root=null;
        //while(T-->0){
            //int data=sc.nextInt();
            root=insert(root,3);
        root=insert(root,5);
        root=insert(root,2);
        root=insert(root,1);
        root=insert(root,4);
        root=insert(root,6);
        root=insert(root,7);
        //root=insert(root,9);

        //}
        int height=getHeight(root);
        System.out.println(height);
    }
}