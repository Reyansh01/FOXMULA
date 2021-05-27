package com.foxmula.assignment01;
import java.util.Scanner;

public class Stack {
    int max, top;
    int stack[];

    Stack(int i) {
        top = -1;
        max = i;
        stack = new int[max];
    }

    //function to push elements.
    void push(int num)
    {
        if (top == max)
            System.out.println("Stack Overflow.");
        else
            stack[++top] = num;
    }

    //function to pop elements.
    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stack[--top];
    }

    //function to check whether stack is empty or not.
    boolean checkEmpty()
    {
        if (max == -1)
            return true;
        return false;
    }

    //function to count total number of elements in the stack.
    int count()
    {
        return (top > -1 ? top+1 : 0);    //conditional
    }

    void display(Stack sobj1,Stack sobj2)
    {
        if(sobj1.count() == sobj2.count())
            System.out.println("Number of elements in the stack are: " + sobj1.count());
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack(5);
        Stack s2 = new Stack(5);

        int ch, data;

        while(true) {
            System.out.println("\n1. For Pushing elements in stack 1 press 1: ");
            System.out.println("2. For Pushing elements in stack 2 press 2: ");
            System.out.println("3. For Popping elements from stack1 press 3: ");
            System.out.println("4. For Popping elements from stack2 press 4: ");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();


            switch (ch) {
                case 1:
                    System.out.println("Enter data: ");
                    data = sc.nextInt();
                    s1.push(data);
                    s1.display(s1, s2);
                    break;
                case 2:
                    System.out.println("Enter data: ");
                    data = sc.nextInt();
                    s2.push(data);
                    s1.display(s1, s2);
                    break;
                case 3:
                    System.out.println(s1.pop());
                    s1.display(s1, s2);
                    break;
                case 4:
                    System.out.println(s2.pop());
                    s1.display(s1, s2);
                    break;
                default:
                    System.out.println("Exit");
            }
            if (ch > 4) {
                break;
            }
        }
    }
}
