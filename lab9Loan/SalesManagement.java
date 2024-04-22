package lab9Loan;

import java.util.ArrayList;

public class SalesManagement {
    private ArrayList<Product> products;
    private ArrayList<User> users;
    private ArrayList<Order> orders;
    private static final double PRIME_DISCOUNT = 0.05;

    public SalesManagement() {
        this.products = new ArrayList<>();
        this.users = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void countProductsLeft() {
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getQuantity() + " left");
        }
    }

    public void makeOrder(Order order) {
        try {
            Integer userId = order.getUserId();
            String productName = order.getProductName();
            Integer quantity = order.getQuantity();

            User user = null;
            for (User u : users) {
                if (u.getId().equals(userId)) {
                    user = u;
                    break;
                }
            }

            if (user != null) {
                Product product = null;
                for (Product p : products) {
                    if (p.getName().equals(productName)) {
                        product = p;
                        break;
                    }
                }

                if (product != null) {
                    Double totalPrice = product.getPrice() * quantity;
                    if ("Prime".equals(user.getStatus()) && quantity > 1) {
                        totalPrice *= PRIME_DISCOUNT;
                    }

                    if (user.getBalance() >= totalPrice) {
                        if (product.getQuantity() >= quantity) {
                            product.updateQuantity(quantity);
                            user.updateBalance(-totalPrice);
                            order.setPrice(totalPrice);
                            if ("Prime".equals(user.getStatus()) && quantity > 1) {
                                totalPrice *= order.getCashback();
                                user.addOrder(order);

                            }
                            System.out.println("Order placed successfully!");
                        } else {
                            throw new Exception("Product not available in sufficient quantity!");
                        }
                    } else {
                        throw new Exception("Insufficient balance for order!");
                    }
                } else {
                    throw new Exception("Product not found!");
                }
            } else {
                throw new Exception("User not found!");
            }
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }

    public void retrieveUsers() {
        System.out.println("\nList of Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void retrieveProducts() {
        System.out.println("\nList of Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void retrieveOrders() {
        System.out.println("\nList of Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void placeOrder(int userId, String productName, int quantity) {
        Order order = new Order(userId, productName, quantity);
        orders.add(order);
        makeOrder(order);
    }
}
