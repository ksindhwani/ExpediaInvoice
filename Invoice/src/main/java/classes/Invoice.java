package main.java.classes;

import main.java.models.Order;

public class Invoice {

    private final Order order;
    private double totalBill;
    private double totalTax;

    public Invoice(Order order) {
        this.order = order;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public double getTotalTax() {
        return totalTax;
    }

    /**
     * Function to Calcuulate Bill and Tax
     */
    public void calculateBillAndTax() {
        order.getOrderedItems().forEach(orderItem -> {
            totalBill += orderItem.getAmount();
            totalTax += (orderItem.getItem().getActualPrice() - orderItem.getItem().getPrice()) * orderItem.getQuantity();
        });
    }

    /**
     * Function to Print Invoice
     */
    public void printInvoice() {
        order.getOrderedItems().forEach(orderedItem -> {
            System.out.println(orderedItem.getQuantity() + " " + orderedItem.getItem().getName() + ":" + orderedItem.getAmount());
        });
        System.out.println("Sales Taxes: " + totalTax);
        System.out.println("Total: " + totalBill);
    }
}
