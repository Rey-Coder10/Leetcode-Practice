package Hashing;


//Given an array of integer n size ,find all elements that appear more than n/3;

import java.util.*;

public class h1 {

    public static void MajorityElement(int[] num) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = num.length;


        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        MajorityElement(num);


    }
}