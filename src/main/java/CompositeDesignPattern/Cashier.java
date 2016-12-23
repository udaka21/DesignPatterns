package CompositeDesignPattern;

/**
 * Created by udaka on 7/15/16.
 */
public class Cashier extends Employee {

    private int id;
    private String name;
    private double salary;

    public Cashier(int id,String name,double salary)  {
        this.id=id;
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    public void remove(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    public Employee getChild(int i) {
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }






}
