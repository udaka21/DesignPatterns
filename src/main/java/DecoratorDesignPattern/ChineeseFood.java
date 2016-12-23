package DecoratorDesignPattern;

/**
 * Created by udaka on 7/15/16.
 *
 */
public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() +" With Fried Rice and Manchuria  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+65;
    }
}
