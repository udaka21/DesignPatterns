package VisitorDesignPattern;

/**
 * Created by udaka on 7/18/16.
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);

}
