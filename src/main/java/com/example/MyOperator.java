package com.example;

public class MyOperator {

    public String process(String tuple) {
        // Process incoming data - convert to uppercase
        String result = tuple == null ? null : tuple.toUpperCase();
        System.out.println("Processed: " + result);
        return result;
    }
}