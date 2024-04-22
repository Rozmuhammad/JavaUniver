package lab4Loan;

public class lab4SecondTierBank {
    private final double FIXEDBANKREWARD = 0.02;
    private lab4Calculator calculator;

    public lab4SecondTierBank() {
        this.calculator = new lab4Calculator();
    }

    public double calculateDeposit(double amount, int duration, int clientType) {
        String clientTypeName = (clientType == 1) ? "individual" : "legalEntity";
        return calculator.depositReward(amount, duration, clientTypeName) * FIXEDBANKREWARD + amount;
    }
}
