package com.foxmula.assignment03;

import java.util.*;
import java.util.Map.Entry;

public class arrayFrequencySortByValue {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 2, 5, 5, 2, 3, 2, 4, 7, 7, 8}; //8->1, 7->2, 5->2, 4->1, 3->2, 2->4
        int len = numbers.length;
        System.out.println("Initial array is: ");
        for (int digit : numbers) {
            System.out.print(digit + " ");
        }
        System.out.println();

        arrayFrequencySortByValue obj = new arrayFrequencySortByValue();
        obj.occurrenceCounter(numbers, len);
    }

    public void occurrenceCounter(int[] arr, int len) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        System.out.println("HashMap created: ");
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + ": " + e.getValue() + ", ");
        }
        System.out.println();

        printSortedOrder(map);
    }

    public void printSortedOrder(HashMap<Integer, Integer> hmap) {
        Set<Entry<Integer, Integer>> entries = hmap.entrySet();
        ArrayList<Entry<Integer, Integer>> al = new ArrayList<>(entries);
        Collections.sort(al, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println("The array in sorted order based on occurrences is: ");
        al.forEach(value -> System.out.print(value.getKey() + " "));
    }
}
