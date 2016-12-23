package ObserverDesignPattern;

/**
 * Created by udaka on 7/18/16.
 * This is a concrete class that extends from Observer class and convert integer to Binary
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach((Observer) this);
    }

    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
