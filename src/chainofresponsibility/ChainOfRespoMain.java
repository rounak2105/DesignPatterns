package chainofresponsibility;

import chainofresponsibility.entity.DebugLogPpocessor;
import chainofresponsibility.entity.ErrorLogProcessor;
import chainofresponsibility.entity.InfoLogProcessor;
import chainofresponsibility.interfaces.LogProcessor;

public class ChainOfRespoMain {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogPpocessor(new ErrorLogProcessor(null)));
        logProcessor.log(1);
        logProcessor.log(2);
        logProcessor.log(3);
    }
}
