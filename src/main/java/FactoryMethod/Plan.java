/**
 * Created by udaka on 7/14/16.
 */
package FactoryMethod;

/**
 * This abstract class contains the basics of an electricity Bill
 */

abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
