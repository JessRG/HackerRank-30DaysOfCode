import java.util.*;
import java.io.*;
class Node0 {
    Node0 left,right;
    int data;
    Node0(int data){
        this.data=data;
        left=right=null;
    }
}

/**
 * Day 22: Binary Search Trees
 *
 * Sample Input:
 *
 * 7
 * 3
 * 5
 * 2
 * 1
 * 4
 * 6
 * 7
 * */
class BSTs {
    /**
     * Function to get the height of the Binary Search Tree (BST)
     * */
    public static int getHeight(Node0 root){
        //Write your code here
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));

            // first way I did this
            //   int lHeight = getHeight(root.left);
            //   int rHeight = getHeight(root.right);

            //   if (lHeight > rHeight) return 1 + lHeight;
            //   else return 1 + rHeight;
        }
    }

    public static Node0 insert(Node0 root,int data){
        if(root==null){
            return new Node0(data);
        }
        else{
            Node0 cur;
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
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node0 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}