package StrategyDesignPattern;

/**
 * Created by udaka on 7/18/16.
 * Context Class that point to the Strategy Interface
 */
public class Context {



    private Strategy strategy;

    public Context (Strategy strategy1) {
        this.strategy = strategy1;
    }

    public int executeStrategy (int num1, int num2) {
        return strategy.doOperation(num1,num2);
    }
}
