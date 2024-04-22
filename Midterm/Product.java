package Midterm;

public class Product {
    private Integer id;
    private String productName;
    private Integer price;
    private Integer quantity;
    private String category;

    public Product(Integer id, String productName, Integer price, Integer quantity, String category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void displayInformation() {
        System.out.println("ID: " + id);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
        System.out.println();
    }
}
