package com.foxmula.assignment02;
import java.util.*;

public class HashSetTraversal {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 if you want to add or press 0 if you don't want to add:");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the element you want to add: ");
                int num = sc.nextInt();
                set.add(num);
            } else {
                break;
            }
        }

        for (int setEle : set) {
            System.out.print(setEle + " ");
        }
    }
}
