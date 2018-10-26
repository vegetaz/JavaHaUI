/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session03;

import java.util.ArrayList;

/**
 *
 * @author Vegetaz
 */
class ArrayListDemo {

    public ArrayListDemo() {
        // create array list
        ArrayList a1 = new ArrayList();
        a1.iterator();
        System.out.println("Initial size of a1: " + a1.size());

        // add elements to the arraylist
        a1.add("C");
        a1.add(1);
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add("OK"); //a1.add(new String("OK"));
        System.out.println("Size of a1 after additions:" + a1.size());
        a1.remove("F");
        a1.remove(2);
        System.out.println("Size of a1 after deletions:" + a1.size());
        System.out.println("Contents of a1: " + a1);
    }

    public static void main(String[] args) {
        ArrayListDemo arr = new ArrayListDemo();
    }
}
