// Program to reverse a linked list using three pointer next,prev and curr
package Linked_List;

public class link_rev {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int da) {
            this.data = da;
            this.next = null;
        }
    }

    public void AddLast(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = NewNode;
        NewNode.next = null;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }

    public Node reverse(Node node) {
        Node curr = head;
        Node prev = null;
        Node temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        link_rev dl = new link_rev();
        dl.AddLast(1);
        dl.AddLast(2);
        dl.AddLast(3);
        dl.display();
        System.out.println();
        head = dl.reverse(head);
        dl.display();
    }
}
