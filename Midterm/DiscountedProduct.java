package Midterm;

public class DiscountedProduct extends Product {
    private Integer discountPercentage;

    public DiscountedProduct(Integer id, String productName, Integer price, Integer quantity, String category,
            Integer discountPercentage) {
        super(id, productName, price, quantity, category);
        this.discountPercentage = discountPercentage;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("Discount Percentage: " + discountPercentage + "%");
    }
}
