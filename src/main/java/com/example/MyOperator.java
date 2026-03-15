package com.example;

public class MyOperator {
    public void process(String tuple) {
        // Process incoming data - convert to uppercase
        String result = tuple.toUpperCase();
        System.out.println("Processed: " + result);
    }
}