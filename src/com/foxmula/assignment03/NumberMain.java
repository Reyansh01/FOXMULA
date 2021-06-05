package com.foxmula.assignment03;

import java.util.Scanner;

public class customException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number == 0 || number == 1) {
            System.out.println(number + " is Valid.");
        } else {
            try {
                for (int i = 2; i < number/2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime && (number % 2 != 0)) {
                    throw new oddPrimeException();
                } else {
                    System.out.println(number + " is valid.");
                }

            } catch (oddPrimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
