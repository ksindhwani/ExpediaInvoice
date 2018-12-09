package main.java.models;

public class OrderedItems {
    private final Item item;
    private final int quantity;
    private double amount;

    public OrderedItems(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.amount = calculateAmount();
    }

    private double calculateAmount() {
        return item.getActualPrice() * quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }
}
