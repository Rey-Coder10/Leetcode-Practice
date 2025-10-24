package Stack;

//It is a stack implementation using Linked List
public class StackLinkedList {

    private Node top;

    public StackLinkedList() {
        this.top = null;
    }
//    push

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = top;
        top = new_node;
    }

//    pop

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int Value = top.data;
            top = top.next;
            return Value;
        }
    }


//    peek

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return top.data;
        }
    }

//    isEmpty

    public boolean isEmpty() {
        if (this.top == null) {
            System.out.println("Stack is empty!!");
            return true;
        } else {
            return false;
        }
    }


//    display


    public void display() {
        if (isEmpty()) {
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList st = new StackLinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
    }
}

