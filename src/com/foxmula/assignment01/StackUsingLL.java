package com.foxmula.assignment01;
import java.util.Scanner;

public class StackUsingLL {

    private class LinkedList {
        int data;
        LinkedList next;

        //parameterized constructor
        LinkedList(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //creating a node for the top of the stack.
    private LinkedList topOfTheStack;
    private int size = 0;

    //Add elements in the Stack.
    private void push(int num) {
        LinkedList temp = new LinkedList(num);
        temp.next = topOfTheStack;
        topOfTheStack = temp;
        size++;
    }

    //Deleting elements from the Stack.
    private int pop() {

        //Underflow condition.
        if(size == 0) {
            System.out.println("There is no element in the stack - UNDERFLOW..");
            return 0;
        }
        else {
            int poppedElement;
            poppedElement = topOfTheStack.data;
            topOfTheStack = topOfTheStack.next;
            size--;
            return poppedElement;
        }
    }

    //display all the elements in a Stack.
    private void display() {
        LinkedList curr = topOfTheStack;
        while(curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    private int Size() {
        return size;
    }

    public static void main(String[] args) {
        StackUsingLL obj = new StackUsingLL();
        int ch, data;

        while(true) {
            System.out.println("\n1. For Pushing elements in stack: ");
            System.out.println("2. For Popping elements from stack: ");
            System.out.println("3. For displaying the Size of the Stack: ");
            System.out.println("4. For displaying the Stack: ");
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter data: ");
                    data = sc.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    System.out.println("Popped data is: " +obj.pop());
                    break;
                case 3:
                    System.out.println("Size of the Stack is: " +obj.Size());
                    break;
                case 4:
                    obj.display();
                    break;
                default:
                    System.out.println("Exit");
            }
            if (ch > 4 || ch < 1) {
                break;
            }
        }
    }
}
