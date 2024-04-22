package lab7Loan;

public class Book extends Product {
    private String title;
    private String publisher;
    private int yearPublished;

    public Book(int barcode, double regularPrice, String title, String publisher, int yearPublished) {
        super(barcode, regularPrice);
        this.title = title;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    @Override
    public double computeSalePrice() {
        return super.regularPrice * 0.5; // Price of a book is 0.5 * regular price
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title + ", Publisher: " + publisher + ", Year Published: "
                + yearPublished;
    }
}
