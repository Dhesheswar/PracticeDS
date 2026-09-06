package LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        LinkedList list = new LinkedList();
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            list.insertAtLast(num);
        }
        reverseLinkedList(list);
        Node temp = list.head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }
    public static void reverseLinkedList(LinkedList list){
        Node prev = null;
        Node curr = list.head;
        Node next = null;
        while(curr != null){
            next = curr.next; // store next node
            curr.next = prev; // change curr node link to prev
            prev = curr;      // move prev forward
            curr = next;      // move curr forward
        }
        list.head = prev;
    }
}
