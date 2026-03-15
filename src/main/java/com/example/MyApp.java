package com.example;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {
    private static final Logger logger = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String mode = args[0].toLowerCase();
        switch (mode) {
            case "local":
                runLocal();
                break;
            case "echo":
                runEcho(Arrays.copyOfRange(args, 1, args.length));
                break;
            default:
                logger.error("Unknown mode: {}", mode);
                printUsage();
        }
    }

    private static void runLocal() {
        MyOperator operator = new MyOperator();
        operator.process("hello");
        operator.process("world");
        logger.info("Local processing complete");
    }

    private static void runEcho(String[] values) {
        if (values.length == 0) {
            logger.warn("No values provided to echo.");
            return;
        }

        MyOperator operator = new MyOperator();
        for (String value : values) {
            operator.process(value);
        }

        logger.info("Echo processing complete");
    }

    private static void printUsage() {
        System.out.println("Usage: mvn exec:java -Dexec.args=\"local\"\n" +
                "       mvn exec:java -Dexec.args=\"echo hello world\"");
    }
}
