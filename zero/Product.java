package zero;

public abstract class Product {
    protected int barcode;
    protected double price;

    public Product(int barcode, double price) {
        this.barcode = barcode;
        this.price = price;
    }

    public abstract double SalePrice();

    @Override
    public String toString() {
        return "Barcode" + barcode + ", Price" + SalePrice();
    }
}
