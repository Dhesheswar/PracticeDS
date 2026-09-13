package DoublyLinkedList;

public class ListNode {
    int data;
    ListNode next;
    ListNode back;
    ListNode(int data,ListNode next,ListNode back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
    ListNode(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
