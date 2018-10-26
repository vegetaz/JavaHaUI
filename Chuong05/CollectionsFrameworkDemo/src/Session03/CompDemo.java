/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Using a custom comparator
package Session03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Vegetaz
 */
class MyComp implements Comparator {

    @Override
    public int compare(Object a, Object b) {
        String aStr, bStr;
        aStr = (String) a;
        bStr = (String) b;
        // reverse the comparison
        return bStr.compareTo(aStr);
    }
}

public class CompDemo {

    public static void main(String args[]) {
        // create a tree set
        TreeSet ts = new TreeSet(new MyComp());
        // add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // get an itreator
        Iterator i = ts.iterator();
        // display elements
        while (i.hasNext()) {
            Object element = i.next();
            System.out.print(element + " ");
        }
    }
}
