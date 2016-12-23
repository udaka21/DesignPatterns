package Samples;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[]) {
        // create an array list
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        al.add(2,"B4");
        System.out.println("Size of al after additions: " + al.size());
        System.out.println("Contents of al: " + al);

        al.add(2,"Zzzzz");
        System.out.println("Size of al after 2nd additions: " + al.size());

        // display the array list
        System.out.println("Contents of al 2: " + al);
        // Remove elements from the array list
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }

}
