package BridgeDesignPattern;

/**
 * Created by udaka on 7/15/16.
 * QuestionManager class will use Question interface which will act as a bridge.
 */
public class QuestionManager {

    //Use an instance of Question interface
    protected Question q;
    public String catalog;

    public QuestionManager (String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        q.nextQuestion();
    }
    public void previous() {
        q.previousQuestion();
    }
    public void newOne(String quest) {
        q.newQuestion(quest);
    }
    public void delete(String quest) {
        q.deleteQuestion(quest);
    }
    public void display() {
        q.displayQuestion();
    }
    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        q.displayAllQuestions();
    }


}
