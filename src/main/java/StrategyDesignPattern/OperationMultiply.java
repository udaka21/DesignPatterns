package StrategyDesignPattern;

/**
 * Created by udaka on 7/18/16.
 * Concrete class for multypling operations
 */
public class OperationMultiply implements Strategy{
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
