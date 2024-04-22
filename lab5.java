import lab5Loan.*;

import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean running = true;
        while (running) {
            System.out.println("Library System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Assign Book to Student");
            System.out.println("4. Remove Book from Student");
            System.out.println("5. Print All Books and Students");
            System.out.println("6. Print Books Assigned to Student");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    addStudent(scanner, library);
                    break;
                case 3:
                    assignBookToStudent(scanner, library);
                    break;
                case 4:
                    removeBookFromStudent(scanner, library);
                    break;
                case 5:
                    library.printAllBooksAndStudents();
                    break;
                case 6:
                    printBooksAssignedToStudent(scanner, library);
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }
        }
    }

    private static void addBook(Scanner scanner, Library library) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter publication year: ");
        int year = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Book book = new Book(title, author, isbn, year, quantity);
        library.addBook(book);
        System.out.println("Book added successfully.");
    }

    private static void addStudent(Scanner scanner, Library library) {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter student group: ");
        String group = scanner.nextLine();

        Student student = new Student(id, name, surname, group);
        library.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void assignBookToStudent(Scanner scanner, Library library) {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        Student student = findStudentById(studentId, library);
        Book book = findBookByISBN(isbn, library);

        if (student != null && book != null) {
            library.assignBookToStudent(book, student);
            System.out.println("Book assigned successfully.");
        } else {
            System.out.println("Student or book not found.");
        }
    }

    private static void removeBookFromStudent(Scanner scanner, Library library) {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        Student student = findStudentById(studentId, library);
        Book book = findBookByISBN(isbn, library);

        if (student != null && book != null) {
            library.removeBookFromStudent(book, student);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Student or book not found.");
        }
    }

    private static Student findStudentById(int id, Library library) {
        for (Student student : library.getStudents()) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private static Book findBookByISBN(String isbn, Library library) {
        for (Book book : library.getBooks()) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private static void printBooksAssignedToStudent(Scanner scanner, Library library) {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = findStudentById(studentId, library);
        if (student != null) {
            library.printBooksAssignedToStudent(student);
        } else {
            System.out.println("Student not found.");
        }
    }
}
