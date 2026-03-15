package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyOperatorTest {

    @Test
    void processShouldUppercaseInput() {
        MyOperator operator = new MyOperator();
        String result = operator.process("hello");
        assertEquals("HELLO", result);
    }

    @Test
    void processShouldHandleNull() {
        MyOperator operator = new MyOperator();
        String result = operator.process(null);
        assertEquals(null, result);
    }
}
