package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    public int compare(Item o, Item i) {
        if (o.getId().compareTo(i.getId()) > 0){
        return 1;
    }else if (o.getId().compareTo(i.getId()) < 0){
        return -1;
    }else {
        return 0;
    }
    }
}
