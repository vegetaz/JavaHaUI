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
public class ArrayListToArray {

    public ArrayListToArray() {
        // create an array list
        ArrayList a1 = new ArrayList();

        // add elements to the array
        a1.add(1); //a1.add(new Integer(1));
        a1.add(2); //a1.add(new Integer(2));
        a1.add(3); //a1.add(new Integer(3));
        a1.add(4); //a1.add(new Integer(4));
        a1.add(1);

        System.out.println("Contents of a1: " + a1);

        // get array
        Object array[] = a1.toArray();

        int sum = 0;
        //sum the array
        for (int i = 0; i < array.length; i++) {
            sum += ((Integer) array[i]).intValue();
        }

        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        ArrayListToArray artolist = new ArrayListToArray();
    }
}
