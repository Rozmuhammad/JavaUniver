package lab7Loan;

public class ChildrensBook extends Book {
    private int age;

    public ChildrensBook(int barcode, double regularPrice, String title, String publisher, int yearPublished, int age) {
        super(barcode, regularPrice, title, publisher, yearPublished);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double computeSalePrice() {
        return 0.25 * regularPrice; // Price of a children's book is 0.25 * regular price
    }

    @Override
    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}
