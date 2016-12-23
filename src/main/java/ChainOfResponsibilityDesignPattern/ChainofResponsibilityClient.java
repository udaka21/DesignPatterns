package ChainOfResponsibilityDesignPattern;

/**
 * Created by udaka on 7/18/16.
 *
 */
public class ChainofResponsibilityClient {

    private static Logger doChaining () {

        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

        Logger errorLogger =  new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        consoleLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occurred now");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is completed");
    }

}