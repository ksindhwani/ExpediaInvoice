package main.java.models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<OrderedItems> orderedItems = new ArrayList<>();

    public List<OrderedItems> getOrderedItems() {
        return orderedItems;
    }

    public void addAll(List<OrderedItems> orderedItems) {
        this.orderedItems.addAll(orderedItems);
    }
}
