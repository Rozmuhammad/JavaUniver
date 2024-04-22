import java.util.Scanner;
import lab9Loan.*;

public class lab9 {
    public static void main(String[] args) {
        SalesManagement salesManagement = new SalesManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add product");
            System.out.println("2. Add user");
            System.out.println("3. Place order");
            System.out.println("4. Retrieve users");
            System.out.println("5. Retrieve products");
            System.out.println("6. Retrieve orders");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct(salesManagement, scanner);
                    break;
                case 2:
                    addUser(salesManagement, scanner);
                    break;
                case 3:
                    placeOrder(salesManagement, scanner);
                    break;
                case 4:
                    salesManagement.retrieveUsers();
                    break;
                case 5:
                    salesManagement.retrieveProducts();
                    break;
                case 6:
                    salesManagement.retrieveOrders();
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    private static void addProduct(SalesManagement salesManagement, Scanner scanner) {
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product product = new Product(id, name, quantity, price);
        salesManagement.addProduct(product);

        System.out.println("\nProduct added successfully.");
    }

    private static void addUser(SalesManagement salesManagement, Scanner scanner) {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
    
        System.out.print("Enter user surname: ");
        String surname = scanner.nextLine();
    
        System.out.print("Enter user id: ");
        int id = scanner.nextInt();
    
        System.out.print("Enter user balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
    
        User user = new OrdinaryUser(id, name, surname, balance); 
        salesManagement.addUser(user);
    
        System.out.println("\nUser added successfully.");
    }
    

    private static void placeOrder(SalesManagement salesManagement, Scanner scanner) {
        System.out.print("Enter user id: ");
        int userId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter order quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        salesManagement.placeOrder(userId, productName, quantity);
    }
}
