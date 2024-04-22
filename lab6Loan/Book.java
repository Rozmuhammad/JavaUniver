package lab6Loan;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Integer year;
    private Integer quantity;
    private boolean forChildren;

    public Book(String title, String author, String isbn, Integer year, Integer quantity, boolean forChildren) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
        this.forChildren = forChildren;
    }

    public String getTitle() {
        return title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isForChildren() {
        return forChildren;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                ", forChildren=" + forChildren +
                '}';
    }
}
