package BuilderDesignPattern;

/**
 * Created by udaka on 7/17/16.
 * Construct a complex object from simple objects by using step-by-step approach
 */
public class BuilderDemo {
    public static void main(String[] args) {
        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1=cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2=cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }
}
