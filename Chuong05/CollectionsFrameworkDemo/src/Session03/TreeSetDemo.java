/*
 * Demonstate TreeSet
 */
package Session03;

import java.util.TreeSet;

/**
 *
 * @author Vegetaz
 */
public class TreeSetDemo {

    public static void main(String args[]) {
        //create a tree set
        TreeSet ts = new TreeSet();

        // add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("D");

        System.out.println(ts);
    }
}
