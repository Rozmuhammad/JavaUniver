package lab7Loan;

public abstract class Product {
    protected int barcode;
    protected double regularPrice;

    public Product(int barcode, double regularPrice) {
        this.barcode = barcode;
        this.regularPrice = regularPrice;
    }

    public abstract double computeSalePrice();

    @Override
    public String toString() {
        return "Barcode: " + barcode + ", Price: $" + computeSalePrice();
    }
}
