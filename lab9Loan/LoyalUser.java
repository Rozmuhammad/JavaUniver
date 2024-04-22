package lab9Loan;

public class LoyalUser extends User {
    private static final Double CASHBACK_RATE = 0.05;
    private Double cashback;

    public LoyalUser(Integer id, String name, String surname, Double balance) {
        super(id, name, surname, balance);
        this.cashback = 0.0; // Initialize cashback to 0
    }

    public Double getCashbackRate() {
        return CASHBACK_RATE;
    }

    public void addCashback(double amount) {
        cashback += amount;
        updateBalance(amount); 
    }
}

