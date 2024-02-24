package chainofresponsibility.entity;

import chainofresponsibility.interfaces.LogProcessor;

public class InfoLogProcessor extends LogProcessor {


    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel) {
        if(logLevel == LogProcessor.INFO)
            System.out.println("printed an INFO log");
        else
            super.log(logLevel);

    }

}
