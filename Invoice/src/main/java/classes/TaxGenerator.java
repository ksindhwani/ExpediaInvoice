package main.java.classes;


import main.java.models.Item;

public class TaxGenerator {

    /**
     *
     * @param item
     * @return double - Tax on an item
     */
    public static double generateTax(Item item) {
        return (item.getPrice() * item.getItemType().getTaxPercent()) / 100.0;
    }
}
