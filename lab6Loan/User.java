package lab6Loan;

import java.util.ArrayList;

public class User {
    private Integer id;
    private String name;
    private String surname;
    private String group; // For students or class for pupils
    private ArrayList<Book> borrowedBooks;

    public User(Integer id, String name, String surname, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.borrowedBooks = new ArrayList<>();
    }

    public void check() {
        System.out.println("This is a user.");
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
