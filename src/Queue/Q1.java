package Queue;

//queue operations of enqueue and dequeue using Array.
public class Q1 {
    //    Array to store data.
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    Q1(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

//    Insertion of data takes place at rear /operation Enqueue.

    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full!!");
            return;
        }
        rear++;
        queue[rear] = data;
        System.out.println("Data is inserted in queue!!");
    }

    //    Deletion of data takes place from front /operation dequeue
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        int data = queue[front];
        front++;
        return data;
    }

    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty!!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1(5);

        q1.enqueue(200);
        q1.enqueue(300);
        q1.display();
        q1.dequeue();
        q1.display();
    }
}
