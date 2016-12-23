package CompositeDesignPattern;

/**
 * Created by udaka on 7/15/16.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee emp1 = new Cashier(101, "Kamal" , 2000.0);
        Employee emp2 = new Cashier(102, "Nimal" , 23000.00);
        Employee emp3 = new Accountant(102, "Sunil" , 40000);
        Employee mgr1 = new BankManager(100, "Piyal" , 80000);

        mgr1.add(emp1);
        mgr1.add(emp2);
       // mgr1.add(emp3);

        mgr1.print();
    }
}
