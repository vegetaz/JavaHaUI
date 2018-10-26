/*
 * Demonstrate Linked List.
 */
package Session03;

import java.util.LinkedList;

/**
 *
 * @author Vegetaz
 */
public class LinkedListDemo {

    public static void main(String args[]) {
        // create a linked list
        LinkedList L1 = new LinkedList();
        // add elements to the linked list
        L1.add("F");
        L1.add("B");
        L1.add("D");
        L1.add("E");
        L1.add("C");
        L1.addLast("Z");
        L1.addFirst("A");
        System.out.println("Original contents of L1: " + L1);
        // remove elements form the linked list
        L1.remove("F");
        L1.remove(2);
        System.out.println("Contents of L1 after deletion: " + L1);
        // remove first and last elements
        L1.removeFirst();
        L1.removeLast();
        System.out.println("L1 after deleting the first and last: " + L1);
        // get and set a value
        Object val = L1.get(2);
        L1.set(2, (String) val + " Changed");

        System.out.println("L1 after change: " + L1);
    }
}
