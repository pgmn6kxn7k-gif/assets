package com.example;

import java.util.Arrays;

public class MyApp {
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
                System.err.println("Unknown mode: " + mode);
                printUsage();
        }
    }

    private static void runLocal() {
        MyOperator operator = new MyOperator();
        operator.process("hello");
        operator.process("world");
        System.out.println("Local processing complete");
    }

    private static void runEcho(String[] values) {
        if (values.length == 0) {
            System.err.println("No values provided to echo.");
            return;
        }

        MyOperator operator = new MyOperator();
        for (String value : values) {
            operator.process(value);
        }

        System.out.println("Echo processing complete");
    }

    private static void printUsage() {
        System.out.println("Usage: mvn exec:java -Dexec.args=\"local\"\n" +
                "       mvn exec:java -Dexec.args=\"echo hello world\"");
    }
}
