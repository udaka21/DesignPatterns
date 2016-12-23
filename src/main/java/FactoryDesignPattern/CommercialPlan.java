package FactoryDesignPattern;

/**
 * Created by udaka on 7/17/16.
 * Create CommercialPlan concrete class that extends Plan abstract class
 */
class CommercialPlan extends Plan {
    void getRate() {
        rate=7.50;
    }
}
