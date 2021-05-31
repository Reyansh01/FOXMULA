package com.foxmula.assignment02;
import java.util.*;

public class ArrayListOccurrence {

    public void Occurrence(ArrayList<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            }
            else {
                int count = map.get(i);
                map.put(i, count + 1);
            }
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()) {
            System.out.print(e.getKey()+ ": " +e.getValue() + ", ");
        }
    }

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

        ArrayListOccurrence obj = new ArrayListOccurrence();
        obj.Occurrence(elements);
    }
}
