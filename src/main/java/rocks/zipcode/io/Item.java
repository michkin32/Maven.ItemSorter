package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item implements Comparable<Item> {
    Long theId = 0L;
    String theName = "";
    Double thePrice = 0.01;
    public Item() {
    }

    public Item(Long id, String name, Double price) {
        this.theId = id;
        this.theName = name;
        this.thePrice = price;
    }

    public String getName() {
        return theName;
    }

    public void setName(String name) {
        this.theName = name;
    }

    public Long getId() {
        return theId;
    }

    public void setId(Long id) {
        this.theId = id;
    }

    public Double getPrice() {
        return thePrice;
    }

    public void setPrice(Double price) {
        this.thePrice = price;
    }

    public int compare(Item i, Item o) {

            if (o.getName().compareTo(i.getName()) > 0) {
                return 1;
            } else if (o.getName().compareTo(i.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }


    @Override
    public int compareTo(Item o) {
        return 0;
    }
}
