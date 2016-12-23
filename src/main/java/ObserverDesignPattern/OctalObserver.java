package ObserverDesignPattern;

/**
 * Created by udaka on 7/18/16.
 * This is a concrete class that extends from Observer class and convert integer to Octal
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach((Observer) this);
    }

    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
