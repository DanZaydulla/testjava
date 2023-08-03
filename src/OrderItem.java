public class OrderItem {
    private int itemId;
    private String itemName;
    private double itemPrice;

    public OrderItem(int itemId, String itemName, double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return itemId;
    }

    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return itemPrice;
    }
}
