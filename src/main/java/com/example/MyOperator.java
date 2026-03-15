package com.example;

import com.datatorrent.api.DefaultInputPort;
import com.datatorrent.api.DefaultOutputPort;
import com.datatorrent.common.util.BaseOperator;

public class MyOperator extends BaseOperator {
    public final transient DefaultInputPort<String> input = new DefaultInputPort<String>() {
        @Override
        public void process(String tuple) {
            // Process incoming data - convert to uppercase
            output.emit(tuple.toUpperCase());
        }
    };

    public final transient DefaultOutputPort<String> output = new DefaultOutputPort<>();
}