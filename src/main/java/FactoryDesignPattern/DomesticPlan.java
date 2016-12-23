package FactoryDesignPattern;

/**
 * Created by udaka on 7/17/16.
 * Create DomesticPlan concrete class that extends Plan abstract class.
 */
class DomesticPlan extends Plan{
    void getRate() {
        rate = 3.50;
    }
}
