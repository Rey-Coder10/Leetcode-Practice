package Linked_List.Easy;

//Iterative Linked List Reversal approach.
public class Reverse {
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


    public Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();
        rev.addLast(1);
        rev.addLast(2);
        rev.addLast(3);
        rev.addLast(4);
        rev.addLast(5);
        System.out.println("Linked List Before: ");
        rev.print();
        System.out.println();
        head = rev.reverse(head);
        System.out.println("Linked List After: ");
        rev.print();
    }
}
