package Linked_List.Theory_Doubly_Syntax;

//Doubly Linked List for deletion operation from front and end.

//TC for delFirst is O(1).
//TC for delLast is O(n)
public class Double2 {
    static Node head, tail;

    class Node {
        int data;
        Node next,prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Node delFirst(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty!!");
        }
        Node curr = head;
        head = head.next;
        head.prev = null;
        return head;
    }

    public void delLast() {
        if (tail == null) {
            System.out.println("Linked List is empty!!");
            return;
        }
        if (tail.prev == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Double2 d2 = new Double2();
        d2.addLast(1);
        d2.addLast(2);
        d2.addLast(3);
        d2.addLast(4);
        d2.addLast(5);
        d2.printList();
        System.out.println();
        d2.delLast();
        d2.printList();
//        head = d2.delFirst(head);
//        d2.printList();
    }
}
