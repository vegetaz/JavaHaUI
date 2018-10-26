/*
 * Demonstrate HashSet.
 */
package Session03;

import java.util.HashSet;

/**
 *
 * @author Vegetaz
 */
public class HashSetDemo {
    public static void main(String args[]) {
		// create  ahash set
		HashSet hs = new HashSet();
		
		// add elements to the hashset
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		
		System.out.println(hs);
	}
}
