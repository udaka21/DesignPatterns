/**
 * Created by udaka on 7/14/16.
 */
package AdaptorDesignPattern;

/**
 * This is the Adaptee class that  is used by the Adapter class to reuse the existing functionality and modify them for desired use.
 * So the adding functionality is credit card availability for a requested  client.
 */

class BankDetails {

    private String bankName;
    private String accHolderName;
    private long accNumber;

    public String getBankName() {

        return bankName;
    }
    public void setBankName(String bankName) {

        this.bankName = bankName;
    }
    public String getAccHolderName() {

        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) {

        this.accHolderName = accHolderName;
    }
    public long getAccNumber() {

        return accNumber;
    }
    public void setAccNumber(long accNumber) {

        this.accNumber = accNumber;
    }


}
