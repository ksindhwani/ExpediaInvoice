package main.java.models;

import main.java.classes.TaxGenerator;
import main.java.enums.ItemType;

public class Item {

    private final String name;
    private final double price;
    private final double actualPrice;
    private final ItemType itemType;

    public Item(String name, ItemType itemType, double price) {
        this.name = name;
        this.itemType = itemType;
        this.price = price;
        this.actualPrice = getActualPrice(this);
    }

    private double getActualPrice(Item item) {
        return this.price + TaxGenerator.generateTax(this);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
