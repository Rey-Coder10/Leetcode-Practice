package Linked_List;

public class link2 {
    // Linked list Deletion operation.
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
        Node david = new Node(data);
        if (head == null) {
            head = david;
            return;
        }
        Node newNode = head;
        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = david;
        david.next = null;
    }

    public void DelFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void print(Node head) {
        Node newNode = head;
        while (newNode != null) {
            System.out.print(newNode.data + "->");
            newNode = newNode.next;
        }
    }

    public void DelLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node SecondLast = head;
        Node LastNode = head.next;
        while (LastNode.next != null) {
            SecondLast = SecondLast.next;
            LastNode = LastNode.next;
        }
        SecondLast.next = null;
    }

    public Node DelSpec(Node head, int pos) {
        Node temp = head;
        Node prev = null;
        if (temp == null) {
            return head;
        }
        if (pos == 1) {
            head = temp.next;
            return head;
        }

//        for rest of the linked list

        for (int i = 1; temp != null && i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            prev.next = temp.next;
        } else {
            System.out.print("No data found");
        }
        return head;
    }


    public static void main(String[] args) {
        link2 l2 = new link2();
        l2.AddLast(1);
        l2.AddLast(2);
        l2.AddLast(3);
        l2.AddLast(4);
        l2.AddLast(5);
        l2.AddLast(6);
        System.out.println("Original Linked List");
        l2.print(head);
        System.out.println();
//        System.out.println("After deletion at first");
//        l2.DelLast();
//        l2.print();
//        head = l2.DelSpec(head, 4);
//        System.out.println("Linked list deletion at specific location");
//        l2.print(head);

    }
}

