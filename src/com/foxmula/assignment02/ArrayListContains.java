package com.foxmula.assignment02;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListContains {

    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Press 1 if you want to add or press 0 if you don't want to add:");
            int choice = sc.nextInt();
            if(choice == 1) {
                System.out.println("Enter the element you want to add: ");
                int num = sc.nextInt();
                elements.add(num);
            }
            else {
                break;
            }
        }

        for(int ele: elements) {
            System.out.print(ele + " ");
        }

        System.out.println();
        System.out.println("Enter the element which you want to check whether it is present or not: ");
        int check = sc.nextInt();
        if(elements.contains(check)) {
            System.out.println(check + " is present in the arraylist...");
        }
        else {
            System.out.println("Element is not present in the arraylist...");
        }

    }

}
