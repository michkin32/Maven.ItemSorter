package rocks.zipcode.io;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] itemsNotSorted;

    public ItemSorter(Item[] items) {
        itemsNotSorted =  items;


    }

    public Item[] sort(Comparator<Item> comparator) {

        Arrays.sort(itemsNotSorted, comparator);

        return itemsNotSorted;
    }

}
