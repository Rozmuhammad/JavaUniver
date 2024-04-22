package lab9Loan;

import java.util.ArrayList;

public class User {
    private Integer id;
    private String name;
    private String surname;
    private Double balance;
    private ArrayList<Order> orderHistory;
    private String status; 
    private int numOrders; 
    private static final double PRIME_DISCOUNT = 0.05;

    public User(Integer id, String name, String surname, Double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.orderHistory = new ArrayList<>();
        this.status = "Ordinary"; 
        this.numOrders = 0; 
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
        numOrders++; 
        if (numOrders > 10) {
            status = "Prime";
        }
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

    public Double getBalance() {
        return balance;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public String getStatus() {
        return status;
    }

    public void updateBalance(Double amount) {
        if ("Prime".equals(this.status)) {
            amount *= 1 - PRIME_DISCOUNT;
        }
        balance += amount;
    }

    public Double getCashback() {
        if (this instanceof LoyalUser) {
            return ((LoyalUser) this).getCashback();
        } else {
            return 0.0; // No cashback for non-Loyal users
        }
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                '}';
    }
}
