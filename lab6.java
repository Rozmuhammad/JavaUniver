import lab6Loan.*;

import java.util.ArrayList;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        ArrayList<User> guests = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("Library System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Add Pupil");
            System.out.println("4. Assign Book to User");
            System.out.println("5. Remove Book from User");
            System.out.println("6. Print All Books and Users");
            System.out.println("7. Print Books Assigned to User");
            System.out.println("8. Check User by ID");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    addStudent(scanner, library, guests);
                    break;
                case 3:
                    addPupil(scanner, library, guests);
                    break;
                case 4:
                    assignBookToUser(scanner, library, guests);
                    break;
                case 5:
                    removeBookFromUser(scanner, library, guests);
                    break;
                case 6:
                    library.printAllBooksAndUsers(guests);
                    break;
                case 7:
                    printBooksAssignedToUser(scanner, library, guests);
                    break;
                case 8:
                    checkUserById(scanner, guests);
                    break;
                case 9:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 9.");
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
        scanner.nextLine(); // Consume newline

        System.out.print("Is this book for children? (yes/no): ");
        String forChildren = scanner.nextLine();

        Book book = new Book(title, author, isbn, year, quantity, forChildren.equalsIgnoreCase("yes"));
        library.addBook(book);
        System.out.println("Book added successfully.");
    }

    private static void addStudent(Scanner scanner, Library library, ArrayList<User> guests) {
        System.out.print("Enter student ID (starting with 2 and consisting of 5 digits): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (isValidStudentId(id)) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student surname: ");
            String surname = scanner.nextLine();
            System.out.print("Enter student group: ");
            String group = scanner.nextLine();

            Student student = new Student(id, name, surname, group);
            library.addUser(student);
            guests.add(student);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Invalid student ID. Student ID should start with '2' and consist of 5 digits.");
        }
    }

    private static void addPupil(Scanner scanner, Library library, ArrayList<User> guests) {
        System.out.print("Enter pupil ID (starting with 1 and consisting of 5 digits): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (isValidPupilId(id)) {
            System.out.print("Enter pupil name: ");
            String name = scanner.nextLine();
            System.out.print("Enter pupil surname: ");
            String surname = scanner.nextLine();
            System.out.print("Enter pupil class: ");
            String group = scanner.nextLine();

            Pupil pupil = new Pupil(id, name, surname, group);
            library.addUser(pupil);
            guests.add(pupil);
            System.out.println("Pupil added successfully.");
        } else {
            System.out.println("Invalid pupil ID. Pupil ID should start with '1' and consist of 5 digits.");
        }
    }

    private static boolean isValidStudentId(int id) {
        String idStr = String.valueOf(id);
        return idStr.length() == 5 && idStr.charAt(0) == '2';
    }

    private static boolean isValidPupilId(int id) {
        String idStr = String.valueOf(id);
        return idStr.length() == 5 && idStr.charAt(0) == '1';
    }

    private static void assignBookToUser(Scanner scanner, Library library, ArrayList<User> guests) {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        User user = findUserById(userId, guests);
        Book book = findBookByISBN(isbn, library);

        if (user != null && book != null) {
            library.assignBookToUser(book, user);
            System.out.println("Book assigned successfully.");
        } else {
            System.out.println("User or book not found.");
        }
    }

    private static void removeBookFromUser(Scanner scanner, Library library, ArrayList<User> guests) {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        User user = findUserById(userId, guests);
        Book book = findBookByISBN(isbn, library);

        if (user != null && book != null) {
            library.removeBookFromUser(book, user);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("User or book not found.");
        }
    }

    private static void printBooksAssignedToUser(Scanner scanner, Library library, ArrayList<User> guests) {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        User user = findUserById(userId, guests);
        if (user != null) {
            library.printBooksAssignedToUser(user);
        } else {
            System.out.println("User not found.");
        }
    }

    private static void checkUserById(Scanner scanner, ArrayList<User> guests) {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        User user = findUserById(userId, guests);
        if (user != null) {
            user.check();
        } else {
            System.out.println("User not found.");
        }
    }

    private static User findUserById(int id, ArrayList<User> guests) {
        for (User user : guests) {
            if (user.getId() == id) {
                return user;
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
}
