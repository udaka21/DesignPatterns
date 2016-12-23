package BridgeDesignPattern1;

/**
 * Created by udaka on 7/18/16.
 * Create concrete bridge implementer classes implementing the DrawAPI interface.
 */
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
