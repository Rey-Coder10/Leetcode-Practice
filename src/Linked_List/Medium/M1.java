package Linked_List.Medium;

//Starting point in a loop in Linked List.
public class M1 {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node startPoint(Node node) {
        Node slow = node;
        Node fast = node;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node start = node;
                while (slow != start) {
                    slow = slow.next;
                    start = start.next;
                }
                return start;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node first = new Node(1);


        first.next = new Node(2);
        first.next.next = new Node(3);
        first.next.next.next = new Node(4);
        first.next.next.next.next = new Node(5);

        first.next.next.next.next = first.next;

        first = startPoint(first);

        if (first != null) {
            System.out.println("Start of loop is from: " + first.data);
        } else {
            System.out.println("No loop exits");
        }

    }
}
