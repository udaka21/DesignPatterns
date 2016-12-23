package FactoryDesignPattern;

/**
 * Created by udaka on 7/17/16.
 * Make an abstract class for the Plan for the Electricity bill.
 */
abstract class Plan {

    protected double rate;
    abstract void getRate();

    public void calculateBill (int units) {
        System.out.println(units*rate);
    }


}
