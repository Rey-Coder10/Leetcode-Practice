package Linked_List.Medium;

//Remove middle Node from the Linked List.
public class M2 {
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
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
    }

    public Node delMid(Node node) {

        if (node == null) {
            return null;
        }

        if (node.next == null) {
            return null;
        }

        Node prev = null;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return node;
    }

    public void print(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        M2 m = new M2();

        m.addLast(1);
        m.addLast(2);
        m.addLast(3);
        m.addLast(4);
        m.addLast(5);
        System.out.println("Original List");
        m.print(head);
        System.out.println();
        System.out.println("List after removal of Middle element");
        head = m.delMid(head);
        m.print(head);
    }
}
