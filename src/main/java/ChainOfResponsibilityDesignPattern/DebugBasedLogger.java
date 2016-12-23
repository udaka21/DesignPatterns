package ChainOfResponsibilityDesignPattern;

/**
 * Created by udaka on 7/18/16.
 *
 */
public class DebugBasedLogger extends Logger {

    public DebugBasedLogger(int levels) {
        this.levels=levels;
    }

    protected void displayLogInfo(String msg) {
        System.out.println("DEBUG LOGGER INFO : " +msg);
    }
}
