package Heap;

import java.util.ArrayList;

//MinHeap implementation here we have insert,extractMin,heapifyd,swap and print

public class MinH {
    static class MinHeap {
        ArrayList<Integer> heap;

        public MinHeap() {
            heap = new ArrayList<>();
        }

//        Parent
        public int parent(int data) {
            return (data - 1) / 2;
        }

//        LeftChild
        public int LeftChild(int data) {
            return 2 * data + 1;
        }

//        RightChild
        public int RightChild(int data) {
            return 2 * data + 2;
        }

//        insert
        public void insert(int data) {
            heap.add(data);
            int curr = heap.size() - 1;

//            Bubble up

            while (curr > 0 && heap.get(curr) < heap.get(parent(curr))) {
                swap(curr, parent(curr));
                curr = parent(curr);
            }
        }

//        ExtractMin
        public void extractMin() {
            if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
            int min = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            heapifyd(0);
            System.out.println(min);
            ;
        }


//        HeapifyDown
        public void heapifyd(int data) {
            int smallest = data;
            int left = LeftChild(data);
            int right = RightChild(data);

            if (left < heap.size() && heap.get(left) < smallest) {
                smallest = left;
            }

            if (right < heap.size() && heap.get(right) < smallest) {
                smallest = right;
            }

            if (data != smallest) {
                swap(data, smallest);
                heapifyd(smallest);
            }
        }

//        swap
        public void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }

//        Print heap
        public void print() {
            System.out.println(heap);
        }

    }

    public static void main(String[] args) {
        MinHeap m = new MinHeap();

        m.insert(10);
        m.insert(20);
        m.insert(5);
        m.insert(30);
        m.insert(2);

        System.out.println("Minheap");
        m.print();

        System.out.println("ExtractMin");
        m.extractMin();
    }
}
