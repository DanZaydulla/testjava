import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some sample order items
        OrderItem item1 = new OrderItem(1, "Item 1", 10.0);
        OrderItem item2 = new OrderItem(2, "Item 2", 15.0);


        Customer customer = new Customer(1, "John", "nana", "fasfasfas",
                "123 St", CustomerType.VIP, 0.5);


        List<OrderItem> regularOrderItems = new ArrayList<>();
        regularOrderItems.add(item1);
        regularOrderItems.add(item2);
        RegularOrder regularOrder = new RegularOrder(101, "Regular Order", "456 Street ",
                regularOrderItems, customer, PaymentType.CREDIT_CARD, "2023-08-03");


        List<OrderItem> vipOrderItems = new ArrayList<>();
        vipOrderItems.add(item1);
        VIPOrder vipOrder = new VIPOrder(201, "VIP Order", "789 Boulevard",
                vipOrderItems, customer, PaymentType.CASH, "2023-08-04");


        printOrderDetails(regularOrder);
        printOrderDetails(vipOrder);


        customer.addFavoriteItem(item1);
        customer.addFavoriteItem(item2);


        customer.takeGift(new CustomerGift() {
            @Override
            public void openGift() {
                System.out.println("Congratulations! you got a new gift! Enjoy!");
            }
        });


        customer.openGift();


        customer.removeFavoriteItem(item2);


        System.out.println("Customer's Favorite Items:");
        for (OrderItem favoriteItem : customer.getFavoriteItems()) {
            System.out.println(favoriteItem.getName() + " - Price: " + favoriteItem.getPrice());
        }
    }

    private static void printOrderDetails(Order order) {
        System.out.println("Order ID: " + order.getId());
        System.out.println("Order Name: " + order.getName());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Payment Type: " + order.getPaymentType());
        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println("Customer ID: " + order.getCustomer().getId());
        System.out.println("Customer Name: " + order.getCustomer().getFirstName() + " " + order.getCustomer().getLastName());
        System.out.println("---------------------------------------------");
    }
}
