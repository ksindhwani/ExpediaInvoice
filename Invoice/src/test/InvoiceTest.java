package test;

import main.java.classes.Invoice;
import main.java.enums.ItemType;
import main.java.models.Item;
import main.java.models.Order;
import main.java.models.OrderedItems;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InvoiceTest{

    Invoice invoice;
    Order order;

    @Before
    public void setup(){
        order = prepareOrder();
        invoice = new Invoice(order);
    }

    @Test
    public void validOrder_shouldPass(){
        invoice.calculateBillAndTax();
        invoice.printInvoice();

        Assert.assertEquals(333,invoice.getTotalBill(),0.01);
        Assert.assertEquals(48,invoice.getTotalTax(),0.01);
    }

    private Order prepareOrder() {
        Order order = new Order();
        order.addAll(orderItems());
        return order;
    }

    private List<OrderedItems> orderItems() {
        Item item1 = new Item("Wine Bottle", ItemType.NON_MEDICAL,40);
        OrderedItems orderedItem1 = new OrderedItems(item1,4);

        Item item2 = new Item("Pen", ItemType.NON_MEDICAL,10);
        OrderedItems orderedItem2 = new OrderedItems(item2,2);

        Item item3 = new Item("Headache Pills Box", ItemType.MEDICAL,15);
        OrderedItems orderedItem3 = new OrderedItems(item3,3);

        Item item4 = new Item("chocolate", ItemType.NON_MEDICAL,30);
        OrderedItems orderedItem4 = new OrderedItems(item4,2);

        List<OrderedItems> orderedItems = new ArrayList<>();
        orderedItems.add(orderedItem1);
        orderedItems.add(orderedItem2);
        orderedItems.add(orderedItem3);
        orderedItems.add(orderedItem4);

        return orderedItems;
    }
}
