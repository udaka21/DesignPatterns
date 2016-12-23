package StrategyDesignPattern;

/**
 * Created by udaka on 7/18/16.
 * Concrete class for subtracting operations
 */
public class OperationSubstract implements Strategy{
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
