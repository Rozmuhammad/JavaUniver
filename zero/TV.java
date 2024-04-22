package zero;

public class TV extends Product {
    private String model;
    private int display;

    public TV(int barcode, String model, double price, int display) {
        super(barcode, price);
        this.display = display;
        this.model = model;
    }

    public double SalePrice() {
        return super.price * 1.3;
    }

    @Override
    public String toString() {
        return super.toString() + ", Model:" + model + ", display size:" + display;
    }
}
