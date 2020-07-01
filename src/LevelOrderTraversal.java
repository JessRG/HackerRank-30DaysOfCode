import java.util.*;
import java.io.*;
class Node1 {
    Node1 left,right;
    int data;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}

/**
 * Day 23: Level-Order Traversal
 *
 * Breadth First Search (BFS)
 *
 * Sample Input:
 *
 * 6
 * 3
 * 5
 * 4
 * 7
 * 2
 * 1
 * */
class LevelOrderTraversal {

    static void levelOrder(Node1 root){
        //Write your code here
        // Declare my queue and add the root node to it
        Queue<Node1> q = new LinkedList<>();
        q.add(root);

        // Breadth First Search (BFS) / Level-Order Traversal
        // using a while loop and queue
        while (!q.isEmpty()) {

            // set current pointer to enqueued node
            // then print that node's data
            Node1 current = q.poll(); // return null if queue is empty (remove function will throw an exception if queue is empty)
            System.out.print(current.data + " ");

            // check current node's left child
            // if not equal to null add it to the queue
            if (current.left != null) {
                q.add(current.left);
            }
            // check current node's left child
            // if not equal to null add it to the queue
            if (current.right != null) {
                q.add(current.right);
            }
        }
    }

    public static Node1 insert(Node1 root,int data){
        if(root==null){
            return new Node1(data);
        }
        else{
            Node1 cur;
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
        Node1 root=null;
        while(T-- > 0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
