package FacadeDesignPattern;

/**
 * Created by udaka on 7/15/16.
 */
public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActivate (int acctNumberToCheck) {

        if(acctNumberToCheck == getAccountNumber()) {

            return true;

        } else {

            return false;

        }
    }

}

