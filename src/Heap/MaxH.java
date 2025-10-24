package Heap;


//MaxHeap Heap Implementation having Insert,ExtractMax heapifyDown,Swap and print.

import java.util.ArrayList;

class MaxH {
    static class MaxHeap {
        private ArrayList<Integer> heap;

        public MaxHeap() {
            heap = new ArrayList<>();
        }

        private int parent(int i) {
            return (i - 1) / 2;
        }

        private int LeftChild(int i) {
            return 2 * i + 1;
        }

        private int RightChild(int i) {
            return 2 * i + 2;
        }


        public void insert(int i) {
            heap.add(i);
            int curr = heap.size() - 1;

//            Bubble up

            while (curr > 0 && heap.get(curr) > heap.get(parent(curr))) {
                swap(curr, parent(curr));
                curr = parent(curr);
            }
        }

        public void extractMax() {
            if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
            int max = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            heapifyd(0);
            System.out.println(max);
        }


        public void heapifyd(int i) {
            int largest = i;
            int left = LeftChild(i);
            int right = RightChild(i);

            if (left < heap.size() && heap.get(left) > heap.get(largest)) {
                largest = left;
            }

            if (right < heap.size() && heap.get(right) > heap.get(largest)) {
                largest = right;
            }

            if (i != largest) {
                swap(i, largest);
                heapifyd(largest);
            }
        }

        public void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }

        public void print() {
            System.out.println(heap);
        }

    }

    public static void main(String[] args) {
        MaxHeap m = new MaxHeap();

        m.insert(10);
        m.insert(20);
        m.insert(5);
        m.insert(30);
        m.insert(2);

        System.out.println("MaxHeap");
        m.print();

        System.out.println("ExtractMax");
        m.extractMax();

    }
}
