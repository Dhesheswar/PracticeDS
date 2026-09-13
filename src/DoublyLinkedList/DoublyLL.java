package DoublyLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DoublyLL {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        ArrayList<Integer> arrList = new ArrayList<>();
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            arrList.add(num);
        }
        ListNode head = null;
        head = new ListNode(arrList.get(0));
        ListNode prev = head;
        for(int i = 1;i< arrList.size();i++){
            ListNode newNode = new ListNode(arrList.get(i),null,prev);
            prev.next = newNode;
            prev = newNode;
        }
        display(head);
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}
