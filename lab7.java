import java.util.ArrayList;
import java.util.Scanner;

import lab7Loan.*;

public class lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add TV");
            System.out.println("3. Add Children's Book");
            System.out.println("4. Print All Products");
            System.out.println("5. Calculate Total Price");
            System.out.println("6. Calculate Average Age of Children's Books");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook(scanner, products);
                    break;
                case 2:
                    addTV(scanner, products);
                    break;
                case 3:
                    addChildrensBook(scanner, products);
                    break;
                case 4:
                    printAllProducts(products);
                    break;
                case 5:
                    calculateTotalPrice(products);
                    break;
                case 6:
                    calculateAverageChildrensBookAge(products);
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

    private static void addBook(Scanner scanner, ArrayList<Product> products) {
        System.out.print("Enter barcode: ");
        int barcode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter regular price: ");
        double regularPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter year published: ");
        int yearPublished = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(barcode, regularPrice, title, publisher, yearPublished);
        products.add(book);
        System.out.println("Book added successfully.");
    }

    private static void addTV(Scanner scanner, ArrayList<Product> products) {
        System.out.print("Enter barcode: ");
        int barcode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter regular price: ");
        double regularPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter TV type: ");
        String typeTV = scanner.nextLine();
        System.out.print("Enter screen size: ");
        double screenSize = scanner.nextDouble();
        scanner.nextLine();

        TV tv = new TV(barcode, regularPrice, typeTV, screenSize);
        products.add(tv);
        System.out.println("TV added successfully.");
    }

    private static void addChildrensBook(Scanner scanner, ArrayList<Product> products) {
        System.out.print("Enter barcode: ");
        int barcode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter regular price: ");
        double regularPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter year published: ");
        int yearPublished = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        ChildrensBook childrensBook = new ChildrensBook(barcode, regularPrice, title, publisher, yearPublished, age);
        products.add(childrensBook);
        System.out.println("Children's book added successfully.");
    }

    private static void printAllProducts(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void calculateTotalPrice(ArrayList<Product> products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.computeSalePrice();
        }
        System.out.println("Total price of all products: $" + totalPrice);
    }

    private static void calculateAverageChildrensBookAge(ArrayList<Product> products) {
        int totalAge = 0;
        int childrensBookCount = 0;
        for (Product product : products) {
            if (product instanceof ChildrensBook) {
                ChildrensBook childrensBook = (ChildrensBook) product;
                totalAge += childrensBook.getAge();
                childrensBookCount++;
            }
        }
        if (childrensBookCount > 0) {
            double averageAge = (double) totalAge / childrensBookCount;
            System.out.println("Average age of children's books: " + averageAge);
        } else {
            System.out.println("No children's books found.");
        }
    }
}
