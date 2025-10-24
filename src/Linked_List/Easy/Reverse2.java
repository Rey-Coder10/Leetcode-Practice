package Linked_List.Easy;

//It is recursive approach for Linked List reversal.
public class Reverse2 {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node rest = reverse(head.next);

        head.next.next = head;

        head.next = null;

        return rest;
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Reverse2 rev2 = new Reverse2();
        rev2.addLast(1);
        rev2.addLast(2);
        rev2.addLast(3);
        rev2.addLast(4);
        rev2.addLast(5);
        System.out.println("Linked List Before: ");
        rev2.print();
        System.out.println();
        head = reverse(head);
        System.out.println("Linked List After: ");
        rev2.print();
    }
}
