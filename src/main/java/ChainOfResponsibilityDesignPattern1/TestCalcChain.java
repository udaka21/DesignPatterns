package ChainOfResponsibilityDesignPattern1;

/**
 * Created by udaka on 7/18/16.
 */
public class TestCalcChain {

    public static void main(String[] args){

        //Defined  all of the objects in the chain

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        //Each object where to forward the data if it can't process the request

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        // Define the data in the Numbers Object and send it to the first Object in the chain

        Numbers request = new Numbers(4,2,"mult");

        chainCalc1.calculate(request);

    }
}
