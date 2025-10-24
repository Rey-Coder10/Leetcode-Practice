package Stack;

//This is stack using an array.
public class st1 {
    private int[] arr;
    private int maxSize;
    private int top = -1;

    public st1(int size) {
        arr = new int[size];
        maxSize = size;
        top = -1;
    }

    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = data;
            System.out.println(data + " is inserted in an Stack");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int pop = arr[top--];
        System.out.println(pop + " Popped out from the stack ");
        return pop;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        st1 st = new st1(5);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element of stack is " + st.peek());
        st.pop();
        st.pop();
        st.pop();
        System.out.println("Is stack empty? " + st.isEmpty());
    }

}
