package ChainOfResponsibilityDesignPattern;

/**
 * Created by udaka on 7/18/16.
 */
public class ErrorBasedLogger extends Logger{

    public ErrorBasedLogger(int levels) {
        this.levels=levels;
    }

    protected void displayLogInfo(String msg) {
        System.out.println("ERROR LOGGER INFO : "+msg);
    }
}
