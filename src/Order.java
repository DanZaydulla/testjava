import java.util.List;

public abstract class Order {
    private int orderId;
    private String name;
    private String deliveryAddress;
    private List<OrderItem> items;
    private Customer customer;
    private double totalPrice;
    private PaymentType paymentType;
    private String orderDate;

    public Order(int orderId, String name, String deliveryAddress, List<OrderItem> items,
                 Customer customer, PaymentType paymentType, String orderDate) {
        this.orderId = orderId;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.items = items;
        this.customer = customer;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.totalPrice = calculateTotalPrice();
    }

    public abstract double calculateTotalPrice();


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public String getOrderDate() {
        return orderDate;
    }
}
