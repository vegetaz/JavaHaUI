/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Vegetaz
 */
public class TestIterator {

    public static void main(String args[]) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        ListIterator i = list.listIterator(list.size());
        while (i.hasPrevious()) {
            System.out.println(i.previous());
        }

    }
}
