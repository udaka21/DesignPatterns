package ChainOfResponsibilityDesignPattern;

/**
 * Created by udaka on 7/18/16.
 */
public class ConsoleBasedLogger extends Logger {

    public ConsoleBasedLogger (int levels) {
        this.levels = levels;
    }

    protected void displayLogInfo(String msg) {
        System.out.println("CONSOLE LOGGER INFO : " +msg);
    }
}
