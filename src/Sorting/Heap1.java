package Sorting;

//MinHeap extractMax,swap and heapify operation.

import java.util.*;

class MinHeap {

    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    //    Parent
    private int parent(int i) {
        return (i - 1) / 2;
    }

    //    Left Child
    private int LeftChild(int i) {
        return 2 * i + 1;
    }

    //    Right Child
    private int RightChild(int i) {
        return 2 * i + 2;
    }

    //Insert operation
    public void insert(int val) {
        heap.add(val);
        int current = heap.size() - 1;

//        Bubble up
        while (current > 0 && heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }


    //    To extract minimum from the heap and then we will heapify it for sure.
    public int extractMin() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");

        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return min;
    }


//    Heapify

    public void heapifyDown(int i) {
        int smallest = i;
        int left = LeftChild(i);
        int right = RightChild(i);

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }


    //    swap method
    public void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }


    public void print() {
        System.out.println(heap);
    }
}


public class Heap1 {


    public static void main(String[] args) {
        MinHeap mp = new MinHeap();

        mp.insert(10);
        mp.insert(5);
        mp.insert(15);
        mp.insert(20);
        mp.insert(25);

        System.out.println("MinHeap");
        mp.print();

        System.out.println("ExtractMin: " + mp.extractMin());
        System.out.println("ExtractMin: " + mp.extractMin());

    }
}
