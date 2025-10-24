package Linked_List.Medium;


//Length of Loop in Linked List
public class M4 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int Loop_count(Node node) {
        int count = 1;
        Node temp = node;

        while (temp.next != node) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int Detect_Loop(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return Loop_count(slow);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

//        Creating a Loop
        head.next.next.next.next.next = head.next;

        int res = Detect_Loop(head);


        if (res == 0) {
            System.out.println("There is no cycle");
        } else {
            System.out.println("The length of loop in a Linked List is :" + res);
        }

    }

}
