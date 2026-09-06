package LinkedList;

public class LinkedList {
    Node head = null; // initialize head

    public void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int data){
        if(head==null){
            insertAtBegining(data); return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
    }

    public void insertAtIndex(int index,int data){
        if(index==0){
            insertAtBegining(data);
            return;
        }
        Node temp = head;
        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        if(temp==null){
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtbegining(){
        if(head==null) return;
        head = head.next;
    }

    public void deleteAtLast(){
        if(head==null) return;
        if(head.next==null){
            head = null;return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteData(int data){
        if(head==null) return;
        if(head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data!=data){
            temp = temp.next;
        }
        if(temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }

    public void deleteAtIndex(int index){
        if(head==null) return;
        if(index == 0){
            deleteAtbegining();
            return;
        }

        Node temp = head;
        for(int i = 0;i < index-1; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next==null) return;
        temp.next = temp.next.next;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.insertAtBegining(1);
        list.insertAtBegining(2);
        list.insertAtBegining(3);

        list.insertAtLast(0);
        list.insertAtIndex(1,5);

        list.deleteAtbegining();
        list.deleteAtIndex(2);
        list.deleteData(2);
        list.deleteAtLast();

        list.display();
    }
}
