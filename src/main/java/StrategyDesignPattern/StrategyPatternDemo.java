package StrategyDesignPattern;

/**
 * Created by udaka on 7/18/16.
 * Use the Context to see change in behaviour when it changes its Strategy.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " +context.executeStrategy(10,5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));
    }

}
