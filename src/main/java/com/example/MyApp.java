package com.example;

public class MyApp {
    public static void main(String[] args) throws Exception {
        // For debugging purposes, test the operator directly
        MyOperator operator = new MyOperator();
        // Simulate processing some input
        operator.process("hello");
        operator.process("world");
        System.out.println("Debug: Operator processed inputs");
    }
}
