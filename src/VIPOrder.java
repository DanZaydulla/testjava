import java.util.List;

public class VIPOrder extends Order {
    public VIPOrder(int orderId, String name, String deliveryAddress, List<OrderItem> items,
                    Customer customer, PaymentType paymentType, String orderDate) {
        super(orderId, name, deliveryAddress, items, customer, paymentType, orderDate);
    }

    @Override
    public double calculateTotalPrice() {


        double total = 0.0;
        for (OrderItem item : getItems()) {
            total += item.getPrice();
        }

        if (getCustomer().getCustomerDiscount() != null) {
            total *= (1 - getCustomer().getCustomerDiscount());
        }

        return total;
    }
}