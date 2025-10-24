package Sorting;
//MaxHeap extractMax,swap and heapify operation.

import java.util.*;

class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    //    Parent
    private int parent(int i) {
        return (i - 1) / 2;
    }


    //    LeftChild
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    //    RightChild
    private int rightChild(int i) {
        return 2 * i + 2;
    }


    public void insert(int val) {
        heap.add(val);
        int current = heap.size() - 1;

//        Bubble up
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }


    public int extractMax() {
        if (heap.isEmpty()) throw new IllegalThreadStateException("Heap is Empty");
        int max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifydown(0);
        return max;
    }

    public void heapifydown(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapifydown(largest);
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

public class Heap2 {
    public static void main(String[] args) {
        MaxHeap mp = new MaxHeap();

        mp.insert(10);
        mp.insert(20);
        mp.insert(5);
        mp.insert(30);
        mp.insert(2);

        System.out.println("MaxHeap");
        mp.print();

        System.out.println("Extract Max " + mp.extractMax());

    }
}
