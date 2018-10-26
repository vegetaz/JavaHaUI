/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session03;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Vegetaz
 */
public class TreeMapDemo {

    public static void main(String args[]) {
        //create a tree map
        TreeMap tm = new TreeMap();

        // put elements in a  map
        //tm.put("John Doe", new Double(3434.34));
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Todd Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        //get set of entries
        Set set = tm.entrySet();
        //get an iterator
        Iterator i = set.iterator();
        //Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //deposit 1000.00 into John Doe's account
//        double balance = ((Double) tm.get("John Doe")).doubleValue();
        double balance = ((Double) tm.get("John Doe"));
//        tm.put("John Doe", new Double(balance + 1000.00));
        tm.put("John Doe", balance + 1000.00);
        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}
