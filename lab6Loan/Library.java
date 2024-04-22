package lab6Loan;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Methods for books
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    // Methods for users
    public void addUser(User user) {
        users.add(user);
    }

    public void assignBookToUser(Book book, User user) {
        if ((user instanceof Pupil && book.isForChildren()) || user instanceof Student) {
            if (book.getQuantity() > 0) {
                user.getBorrowedBooks().add(book);
                book.setQuantity(book.getQuantity() - 1);
            } else {
                System.out.println("Book " + book.getTitle() + " is out of stock.");
            }
        } else {
            System.out.println("Pupils can only borrow books labeled 'for children'.");
        }
    }

    public void removeBookFromUser(Book book, User user) {
        if (user.getBorrowedBooks().contains(book)) {
            user.getBorrowedBooks().remove(book);
            book.setQuantity(book.getQuantity() + 1);
        } else {
            System.out.println(
                    "Book " + book.getTitle() + " is not assigned to " + user.getName() + " " + user.getSurname());
        }
    }

    public void printAllBooksAndUsers(ArrayList<User> guests) {
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("\nUsers:");
        for (User user : guests) {
            System.out.println(user);
        }
    }

    public void printBooksAssignedToUser(User user) {
        System.out.println("Books assigned to " + user.getName() + " " + user.getSurname() + ":");
        for (Book book : user.getBorrowedBooks()) {
            System.out.println(book);
        }
    }

    // Getters for books and users
    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
