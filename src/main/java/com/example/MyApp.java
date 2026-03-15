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

    public static void main(String[] args) throws Exception {
        StramAppLauncher appLauncher = new StramAppLauncher();
        appLauncher.run(new MyApp(), args);
    }
}