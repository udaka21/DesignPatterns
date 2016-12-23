package DecoratorDesignPattern;

/**
 * Created by udaka on 7/15/16.
 */
public class FoodDecorator implements Food{
    private Food newFood;

    public FoodDecorator (Food newFood) {
        this.newFood = newFood;
    }


    public String prepareFood() {
        return newFood.prepareFood();
    }

    public double foodPrice() {
        return newFood.foodPrice();
    }
}
