package Queue;


//Queue data structure using Linked List and operations executed Enqueue,dequeue
public class Q2 {
    private Node front;
    private Node rear;

    Q2() {
        front = null;
        rear = null;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Element inserted is " + rear.data);
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!!");
        } else {
            System.out.println("Element deleted is " + front.data);
            front = front.next;
        }
    }

    public void display() {
        Node curr = front;
        while (curr != null) {
            System.out.print(curr.data + "<->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.enqueue(100);
        q2.enqueue(200);
        q2.enqueue(300);
        q2.display();
        System.out.println();
        q2.dequeue();
        q2.display();
    }
}
