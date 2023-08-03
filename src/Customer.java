import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Double customerDiscount;
    private List<OrderItem> favoriteItems;
    private CustomerGift gift;

    public Customer(int customerId, String firstName, String lastName, String email,
                    String deliveryAddress, CustomerType customerType, Double customerDiscount) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.favoriteItems = new ArrayList<>();
        this.gift = null;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public void setCustomerDiscount(Double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public void setFavoriteItems(List<OrderItem> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public void setGift(CustomerGift gift) {
        this.gift = gift;
    }

    public int getId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    public void addFavoriteItem(OrderItem item) {
        for (OrderItem favItem : favoriteItems) {
            if (favItem.getName().equals(item.getName())) {
                return;
            }
        }
        favoriteItems.add(item);
    }

    public void removeFavoriteItem(OrderItem item) {
        favoriteItems.remove(item);
    }

    public void takeGift(CustomerGift gift) {
        this.gift = gift;
    }

    public void openGift() {
        if (gift != null) {
            gift.openGift();
            gift = null;
        }
    }
    public List<OrderItem> getFavoriteItems() {
        return favoriteItems;
    }
}
