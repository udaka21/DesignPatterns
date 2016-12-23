package ChainOfResponsibilityDesignPattern1;

/**
 * Created by udaka on 7/18/16.
 */
public class MultNumbers implements Chain {

    private  Chain nextInChain;

     public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "mult"){

            System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "+
                    (request.getNumber1()*request.getNumber2()));

        } else {

            nextInChain.calculate(request);

        }

    }
}
