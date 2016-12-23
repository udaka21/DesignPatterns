package BridgeDesignPattern1;

/**
 * Created by udaka on 7/18/16.
 * Create an abstract class Shape using the DrawAPI interface.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}
