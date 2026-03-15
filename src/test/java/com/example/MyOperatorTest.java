package com.example;

public class MyOperatorTest {

    public static void main(String[] args) {
        MyOperator operator = new MyOperator();

        String result = operator.process("hello");
        if (!"HELLO".equals(result)) {
            throw new AssertionError("Expected HELLO but got " + result);
        }

        result = operator.process(null);
        if (result != null) {
            throw new AssertionError("Expected null but got " + result);
        }

        System.out.println("All MyOperator tests passed.");
    }
}
