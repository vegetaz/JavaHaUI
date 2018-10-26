/*
 * Storing user-defined classes in a linked list
 */
package Session03;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Vegetaz
 */
class Address {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

public class MailList {

    public static void main(String args[]) {
        LinkedList ml = new LinkedList();
        // add elements to the lined list
        ml.add(new Address("J.W. West", "11 Oak Ave", "Panorama", "SA", "5066"));
        ml.add(new Address("Ralph Baker", "112 Maple Lane", "Mitchum", "VIC", "5003"));
        ml.add(new Address("Tom Carlton", "34 Elm Street", "Oakley", "WA", "6099"));
        Iterator itr = ml.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element + "\n");
        }
    }
}
