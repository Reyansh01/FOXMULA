package com.foxmula.assignment03;

public class oddPrimeException extends Exception {
    oddPrimeException() {
        super("Number is Invalid.");
    }

    oddPrimeException(String message) {
        super(message);
    }
}
