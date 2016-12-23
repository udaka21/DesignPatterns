package BridgeDesignPattern;

/**
 * Created by udaka on 7/15/16.
 * Use QuestionManager super class.
 */
class QuestionFormat extends QuestionManager {
     QuestionFormat(String catalog) {
        super(catalog);
    }

    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }

}
