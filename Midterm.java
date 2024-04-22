import java.util.Scanner;
import Midterm.*;

public class Midterm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_PRODUCTS = 100;
        Product[] products = new Product[MAX_PRODUCTS];
        int productCount = 0;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Product");
            System.out.println("2. Add Discounted Product");
            System.out.println("3. View All Products");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (productCount < MAX_PRODUCTS) {
                        products[productCount++] = createProduct(scanner);
                    } else {
                        System.out.println("Cannot add more products. Maximum limit reached.");
                    }
                    break;
                case 2:
                    if (productCount < MAX_PRODUCTS) {
                        products[productCount++] = createDiscountedProduct(scanner);
                    } else {
                        System.out.println("Cannot add more products. Maximum limit reached.");
                    }
                    break;
                case 3:
                    displayProducts(products, productCount);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Product createProduct(Scanner scanner) {
        System.out.println("Enter details for regular product:");
        return createProductOrDiscountedProduct(scanner, false);
    }

    private static Product createDiscountedProduct(Scanner scanner) {
        System.out.println("Enter details for discounted product:");
        return createProductOrDiscountedProduct(scanner, true);
    }

    private static Product createProductOrDiscountedProduct(Scanner scanner, boolean isDiscounted) {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Category: ");
        String category = scanner.nextLine();

        if (isDiscounted) {
            System.out.print("Discount Percentage: ");
            int discountPercentage = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            return new DiscountedProduct(id, name, price, quantity, category, discountPercentage);
        } else {
            return new Product(id, name, price, quantity, category);
        }
    }

    private static void displayProducts(Product[] products, int count) {
        System.out.println("All Products:");
        for (int i = 0; i < count; i++) {
            products[i].displayInformation();
        }
        System.out.println();
    }
}
