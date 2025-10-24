package Linked_List;

//Linked List program to add 1
public class link3 {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void AddLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = null;
    }

    public Node reverse(Node pat) {
        Node prev = null;
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


    public void addLink(Node bull) {

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        link3 l = new link3();
        l.AddLast(1);
        l.AddLast(2);
        l.AddLast(3);
        l.print();
        System.out.println();
        head = l.reverse(head);
        l.addLink(head);
        l.print();
    }
}
