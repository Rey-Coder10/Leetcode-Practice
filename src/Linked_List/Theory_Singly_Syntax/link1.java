// Linked list operation of addFirst and addLast
// Linked list Addition operation
package Linked_List;

//Linked List all Addition Operation
public class link1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int da) {
            this.data = da;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
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

    public void print() {
        Node newNode = head;
        while (newNode != null) {
            System.out.print(newNode.data + "->");
            newNode = newNode.next;
        }
    }

    public static void main(String[] args) {
        link1 l1 = new link1();
        l1.addLast(1);
        l1.addLast(2);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.print();
    }
}
