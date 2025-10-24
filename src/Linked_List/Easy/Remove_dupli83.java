package Linked_List.Easy;

public class Remove_dupli83 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node remo_dup(Node node) {
        Node curr = node;
        while (curr != null) {
            Node temp = curr;

            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return node;
    }

    static void print(Node node) {
        Node ptr = node;
        while (ptr != null) {
            System.out.print("-> " + ptr.data);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next = new Node(3);

        Node res = remo_dup(head);

        print(res);

    }
}
