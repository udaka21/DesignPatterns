/**
 * Created by udaka on 7/15/16.
 */

package CompositeDesignPattern;

public abstract class Employee {
    public  abstract int getId();
    public abstract String getName();
    public abstract double getSalary();
    public abstract void add(Employee employee);
    public abstract void remove(Employee employee);
    public abstract Employee getChild(int i);


    public void print() {
        System.out.println("=========================");
        System.out.println("Id ="+getId());
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("=========================");

    }



}
