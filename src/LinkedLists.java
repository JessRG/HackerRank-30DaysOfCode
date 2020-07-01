import java.io.*;
import java.util.*;
class Node2 {
    int data;
    Node2 next;
    Node2(int d){
        data=d;
        next=null;
    }

}
/**
 * Day 24: More Linked Lists
 *
 * Sample Input:
 *
 * 6
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * */
class LinkedLists {

    public static Node2 removeDuplicates(Node2 head) {
        //Write your code here
        Node2 ptr1 = head;
        Node2 ptr2 = null;
        Node2 dup = null;

        // first method I used to solve this problem
        //   while (ptr1 != null && ptr1.next != null) {

        //       // set ptr2 to ptr1
        //       ptr2 = ptr1;
        //       while (ptr2.next != null) {
        //           // check if ptr2 data is equal to ptr1.data
        //           if (ptr1.data == ptr2.next.data) {
        //               // set dup to duplicate node and reassign ptr2.next pointer to
        //               // duplicate's node.next pointer then implement garbage collector
        //               dup = ptr2.next;
        //               ptr2.next = dup.next;
        //               System.gc();
        //           } else {
        //               ptr2 = ptr2.next;
        //           }
        //       }
        //       ptr1 = ptr1.next;
        //   }

        // Solution using a HashSet
        HashSet<Integer> hs = new HashSet<>();

        Node2 current = head;
        Node2 prev = null;
        int val = 0;

        while (current != null) {

            // assign val to the current node.data
            val = current.data;

            // check if current data is contained within hashset
            if (hs.contains(val)) {
                prev.next = current.next;
            } else {
                // if current data is not in the hashset add it to hashset
                // and move prev pointer to current pointer
                hs.add(val);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }

    public static  Node2 insert(Node2 head,int data)
    {
        Node2 p=new Node2(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node2 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node2 head)
    {
        Node2 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node2 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}