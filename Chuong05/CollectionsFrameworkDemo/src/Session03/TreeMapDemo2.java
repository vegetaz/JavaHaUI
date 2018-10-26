/*
 * TreeMap class demo
 * Use a comparator to sort accounts by last name.
 */
package Session03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Vegetaz
 */
// compare last whole words in two Strings
class TComp implements Comparator {

    @Override
    public int compare(Object a, Object b) {
        int i, j, k;
        String aStr, bStr;
        aStr = (String) a;
        bStr = (String) b;
        // find the index of the begining of the last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(0, 1).compareTo(bStr.substring(0, 1));
        if (k == 0) // last names match, check entire name
        {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}

public class TreeMapDemo2 {

    public static void main(String args[]) {
        TreeMap tm = new TreeMap((Comparator) new TComp());
        tm.put("John Doe", new Double(3434.34));
        tm.put("Tom Smith", new Double(123.22));
        tm.put("Jane Baker", new Double(1378.00));
        tm.put("Todd Hall", new Double(99.22));
        tm.put("Ralph Smith", new Double(-19.08));
        Set set = tm.entrySet(); // get a set of entries
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        //deposit 1000.00 into John Doe's account
        double balance = ((Double) tm.get("John Doe")).doubleValue();
        tm.put("John Doe", new Double(balance + 1000.00));
        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}
