package AdaptorDesignPattern;


/**
 * This is the target interface that will be used by clients.
 * This is the new feature that should be implement as a plugin.
 */

interface CreditCard {

    void giveBankDetails();
    String getCreditCard();

}
