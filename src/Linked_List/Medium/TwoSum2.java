package Linked_List.Medium;

public class TwoSum2 {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node addTwo(Node n1, Node n2) {
        Node dummy = new Node(0);
        Node ptr = dummy;
        int carry = 0;
        while (n1 != null || n2 != null || carry > 0) {
            if (n1 != null) {
                carry += n1.data;
                n1 = n1.next;
            }

            if (n2 != null) {
                carry += n2.data;
                n2 = n2.next;
            }
            ptr.next = new Node(carry % 10);
            carry /= 10;
            ptr = ptr.next;
        }
        return dummy.next;
    }

    static void print(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print("-> " + temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node res = addTwo(head, head2);

        print(res);


    }
}
