package Linked_List.Medium;

//Swapping of nodes in a Linked List./
public class M3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node swap(Node node) {
        if (node == null) {
            return null;
        }

        if (node.next == null) {
            return null;
        }

        Node prev = null;
        Node start = node;
        while (start.next != null) {
            prev = start;
            start = start.next;
            Node temp = start;
            start.next = prev;
            prev.next = temp;
        }
        return node;
    }

    static void print(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("The original List: ");
        print(head);
        System.out.println();
        head = swap(head);
        System.out.println("The List after swapping nodes: ");
        print(head);
    }
}
