/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//demo of various algorithms in Collections class
package Session03;
import java.util.*;
/**
 *
 * @author Vegetaz
 */
public class CollectionsDemo {
    public static void main(String args[])  {
		// create and initialize a linked list
		LinkedList L1 = new LinkedList();
		//L1.add(new Integer(-8));  L1.add(new Integer(20));  L1.add(new Integer(-20));  L1.add(new Integer(8));
		L1.add(-8);
                L1.add(20);
                L1.add(-20);
                L1.add(8);
		// create a reverse order comparator
		Comparator r = Collections.reverseOrder();
		// sort list by using the comparator
		Collections.sort(L1, r);
		// get iterator
		Iterator itr = L1.iterator();
		System.out.print("List sorted in reverse: ");
		while(itr.hasNext())
			System.out.print( itr.next() + " ");
		System.out.println();
		Collections.shuffle(L1);
		// display shuffled list
		System.out.println("List Shuffled");
		while(itr.hasNext())
			System.out.print( itr.next() + " ");
		System.out.println();

		System.out.println("Minimum: " + Collections.min(L1));
		System.out.println("Maximum: " + Collections.max(L1));
	}
}
