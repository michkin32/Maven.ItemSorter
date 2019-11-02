package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item o, Item i) {
        if (o.getName().compareTo(i.getName()) > 0){
            return 1;
        }else if (o.getName().compareTo(i.getName()) < 0){
            return -1;
        }else {
            return 0;
        }

    }
}
