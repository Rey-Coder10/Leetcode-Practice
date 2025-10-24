package Linked_List.Circular_Syntax;

public class Circular {
    Node head;
    Node tail;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            head.prev = head;
            tail.next = tail;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp.next != temp) {
            System.out.print(temp.data + " <->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Circular c1 = new Circular();
        c1.addLast(1);
        c1.addLast(2);
        c1.addLast(3);
        c1.addLast(4);
        c1.addLast(5);
        c1.printList();
    }
}
