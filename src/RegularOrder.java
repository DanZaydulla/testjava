import java.util.List;

public class RegularOrder extends Order {
    public RegularOrder(int orderId, String name, String deliveryAddress, List<OrderItem> items,
                        Customer customer, PaymentType paymentType, String orderDate) {
        super(orderId, name, deliveryAddress, items, customer, paymentType, orderDate);
    }

    @Override
    public double calculateTotalPrice() {
        double total = 0.0;
        for (OrderItem item : getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}
