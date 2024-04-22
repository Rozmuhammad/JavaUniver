package lab4Loan;

public class lab4NationalBank {
    private final double FIXEDBANKREWARD = 0.01;
    private lab4Calculator calculator;

    public lab4NationalBank() {
        this.calculator = new lab4Calculator();
    }

    public double calculateDeposit(double amount, int duration, int clientType) {
        String clientTypeName = (clientType == 1) ? "individual" : "legalEntity";
        return calculator.depositReward(amount, duration, clientTypeName) * FIXEDBANKREWARD;
    }
}
