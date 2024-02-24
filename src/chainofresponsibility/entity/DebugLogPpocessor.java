package chainofresponsibility.entity;

import chainofresponsibility.interfaces.LogProcessor;

public class DebugLogPpocessor extends LogProcessor {
    public DebugLogPpocessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel) {
        if(logLevel == LogProcessor.DEBUG)
            System.out.println("printed an DEBUG log");
        else
            super.log(logLevel);

    }
}
