package Linked_List.Medium;

public class M5 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void Sort_List(Node head){

    }

    public void print() {
        Node temp = head;

        while (temp!= null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        M5 m = new M5();

        m.addFirst(3);
        m.addFirst(1);
        m.addFirst(2);
        m.addFirst(4);

        m.print();
    }

}
