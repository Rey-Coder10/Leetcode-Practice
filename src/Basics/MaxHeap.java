package Basics;

import java.util.ArrayList;

public class MaxHeap {
    static class MxH {
        ArrayList<Integer> hea;

        public MxH() {
            hea = new ArrayList<>();
        }

        public int parent(int i) {
            return (i - 1) / 2;
        }

        public int LeftChild(int i) {
            return 2 * i + 1;
        }

        public int RightChild(int i) {
            return 2 * i + 2;
        }

        public void insert(int i) {
            hea.get(i);
            int curr = hea.get(hea.size() - 1);

//            Bubble up

            while (curr > 0 && hea.get(curr) > hea.get(parent(curr))) {
                swap(curr, parent(curr));
                curr = parent(curr);
            }
        }

        public void extractMax() {
            int max = hea.get(0);
            hea.set(0, hea.get(hea.size() - 1));
            hea.remove(hea.size() - 1);
            heapifyd(0);
            System.out.println(max);
        }

        public void heapifyd(int i) {
            int largest = i;
            int left = LeftChild(i);
            int right = RightChild(i);

            if (left < hea.size() && hea.get(left) > hea.get(largest)) {
                largest = left;
            }

            if (right < hea.size() && hea.get(right) > hea.get(largest)) {
                largest = right;
            }

            if (i != largest) {
                swap(i, largest);
                heapifyd(largest);
            }
        }

        public void swap(int i, int j) {
            int temp = hea.get(i);
            hea.set(i, hea.get(j));
            hea.set(j, temp);
        }

        public void print() {
            System.out.println(hea);
        }
    }

    public static void main(String[] args) {
        MxH mx = new MxH();

        mx.insert(10);
        mx.insert(20);
        mx.insert(5);
        mx.insert(30);
        mx.insert(2);

        System.out.println("MaxHeap");
        mx.print();

        System.out.println("ExtractMax");
        mx.extractMax();

    }

}

