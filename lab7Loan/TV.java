package lab7Loan;

public class TV extends Product {
    private String typeTV;
    private double screenSize;

    public TV(int barcode, double regularPrice, String typeTV, double screenSize) {
        super(barcode, regularPrice);
        this.typeTV = typeTV;
        this.screenSize = screenSize;
    }

    @Override
    public double computeSalePrice() {
        return super.regularPrice * 1.2; // Price of a TV is 1.2 * regular price
    }

    @Override
    public String toString() {
        return super.toString() + ", Type TV: " + typeTV + ", Screen Size: " + screenSize;
    }
}
