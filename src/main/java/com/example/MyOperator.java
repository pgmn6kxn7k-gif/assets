package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyOperator {
    private static final Logger logger = LoggerFactory.getLogger(MyOperator.class);

    public String process(String tuple) {
        // Process incoming data - convert to uppercase
        String result = tuple == null ? null : tuple.toUpperCase();
        logger.info("Processed: {}", result);
        return result;
    }
}