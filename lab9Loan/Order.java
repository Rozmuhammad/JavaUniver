package lab9Loan;

public class Order {
    private Integer userId;
    private String productName;
    private Integer quantity;
    private Double price;
    private static final Double CASHBACK_RATE = 0.05;

    public Order(Integer userId, String productName, Integer quantity) {
        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCashback() {
        return CASHBACK_RATE;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
