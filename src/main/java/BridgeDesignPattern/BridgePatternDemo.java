package BridgeDesignPattern;

/**
 * Created by udaka on 7/15/16.
 *
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java Programming Language");

        questions.q = new JavaQuestions();

        questions.delete("What is class?");
        questions.display();

        questions.newOne("What is inheritance?");

        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();
    }
}
