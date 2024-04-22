package lab5Loan;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Student> students;

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignBookToStudent(Book book, Student student) {
        if (book.getQuantity() > 0) {
            student.getBorrowedBooks().add(book);
            book.setQuantity(book.getQuantity() - 1);
        } else {
            System.out.println("Book " + book.getTitle() + " is out of stock.");
        }
    }

    public void removeBookFromStudent(Book book, Student student) {
        if (student.getBorrowedBooks().contains(book)) {
            student.getBorrowedBooks().remove(book);
            book.setQuantity(book.getQuantity() + 1);
        } else {
            System.out.println("Book " + book.getTitle() + " is not assigned to " + student.getName() + " "
                    + student.getSurname());
        }
    }

    public void printAllBooksAndStudents() {
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printBooksAssignedToStudent(Student student) {
        System.out.println("Books assigned to " + student.getName() + " " + student.getSurname() + ":");
        for (Book book : student.getBorrowedBooks()) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
