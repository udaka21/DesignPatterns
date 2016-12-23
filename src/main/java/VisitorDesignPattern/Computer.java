package VisitorDesignPattern;

/**
 * Created by udaka on 7/18/16.
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer () {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};

    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}
