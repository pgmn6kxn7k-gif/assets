package com.example;

import org.apache.hadoop.conf.Configuration;
import com.datatorrent.api.DAG;
import com.datatorrent.api.StreamingApplication;
import com.datatorrent.stram.StramAppLauncher;

public class MyApp implements StreamingApplication {
    @Override
    public void populateDAG(DAG dag, Configuration conf) {
        MyOperator operator = dag.addOperator("myOperator", MyOperator.class);
        // In a real app, connect inputs/outputs to sources/sinks
        // For example: dag.addStream("inputStream", source.output, operator.input);
    }

package com.example;

import org.apache.hadoop.conf.Configuration;
import com.datatorrent.api.DAG;
import com.datatorrent.api.StreamingApplication;
import com.datatorrent.stram.StramAppLauncher;

public class MyApp implements StreamingApplication {
    @Override
    public void populateDAG(DAG dag, Configuration conf) {
        MyOperator operator = dag.addOperator("myOperator", MyOperator.class);
        // In a real app, connect inputs/outputs to sources/sinks
        // For example: dag.addStream("inputStream", source.output, operator.input);
    }

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
}
}