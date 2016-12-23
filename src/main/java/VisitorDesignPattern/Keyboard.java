package VisitorDesignPattern;

/**
 * Created by udaka on 7/18/16.
 */
public class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
