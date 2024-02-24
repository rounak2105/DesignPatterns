package chainofresponsibility.entity;

import chainofresponsibility.interfaces.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel) {
        if(logLevel == LogProcessor.ERROR)
            System.out.println("printed an ERROR log");
        else
            super.log(logLevel);
    }
}
