package zero;

public class Book extends Product {
    private String publisher;
    private Integer year;
    private String title;

    public Book(int barcode, String title, double price, int year, String publisher) {
        super(barcode, price);
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public double SalePrice() {
        return super.price * 0.5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title + ", Publisher: " + publisher + ", Year Published: "
                + year;
    }

}
