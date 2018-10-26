/*
 * HashMap Demo
 */
package Session03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Vegetaz
 */
public class HashMapDemo {
    public static void main(String args[]) {
		//create a hash map
		HashMap hm = new HashMap();

		// out elements to the map
		//hm.put("John Doe", new Double(3434.34));
		hm.put("John Doe", 3434.34);
		hm.put("Tom Smith", 123.22);
		hm.put("Jane Baker", 1378.00);
		hm.put("Todd Hall", 99.22);
		hm.put("Ralph Smith", -19.08);
		// get a set of the entries
		Set set = hm.entrySet();
		// get an iterator()
		Iterator i = set.iterator();
		//Display elements
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.print(me.getValue());
                        System.out.println();
		}
		System.out.println("-----------------------------------------");
		//deposit 1000 into John Doe's account
		//double balance = ((Double)hm.get("John Doe")).doubleValue();
		double balance = ((Double)hm.get("John Doe"));
		//hm.put("John Doe", new Double(balance +1000.00));
		hm.put("John Doe", balance +1000.00);
		System.out.println("John Doe's new balance: " + hm.get("John Doe"));
	}
}
