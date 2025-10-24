package Linked_List.Easy;

//Program to find middle of a Linked List using tortoise and hare method.
public class Middle {
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
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
    }

    public int Tor(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Middle mid = new Middle();
        mid.addLast(3);
        mid.addLast(8);
        mid.addLast(7);
        mid.addLast(1);
        mid.addLast(3);
        int res = mid.Tor(head);
        System.out.println("The middle element of a LL is " + res);
    }
}
