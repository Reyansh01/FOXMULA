package com.foxmula.assignment02;
import java.util.*;

public class ArrayListSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'k' value: ");
        int k = sc.nextInt();

        boolean flag = false;
        int low = 0, high = arr.size()-1;
        while(low < high) {
            if(arr.get(low) + arr.get(high) == k) {
                System.out.println("Pair: (" +arr.get(low)+ "," +arr.get(high)+ ")");
                flag = true;
            }
            if(arr.get(low) + arr.get(high) > k) {
                high--;
            }
            else {
                low++;
            }
        }
        if(!flag) {
            System.out.println("No pair possible..");
        }
    }
}
