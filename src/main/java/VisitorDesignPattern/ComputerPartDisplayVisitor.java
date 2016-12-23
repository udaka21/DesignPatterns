package VisitorDesignPattern;

/**
 * Created by udaka on 7/18/16.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Computer computer) {
        System.out.println("Displaying Computer");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keybord");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }
}
