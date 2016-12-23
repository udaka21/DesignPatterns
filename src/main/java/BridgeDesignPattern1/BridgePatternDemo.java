package BridgeDesignPattern1;

/**
 * Created by udaka on 7/18/16.
 * Use the Shape and DrawAPI classes to draw different colored circles.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
