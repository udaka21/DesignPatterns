package AdaptorDesignPattern;

/**
 * This Demostrate the Adaptor pattern and works as the client class.
 * that interact with the Adapter class.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {

        CreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());

    }
}
