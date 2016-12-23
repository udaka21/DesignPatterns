package FacadeDesignPattern;

/**
 * Created by udaka on 7/15/16.
 */
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(1050.00);

        //accessingBank.withdrawCash(99.00);

        accessingBank.depositCash(100);
    }
}
