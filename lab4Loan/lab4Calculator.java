package lab4Loan;

public class lab4Calculator {
    private final double RATEFORLEGALENTITIES = 0.08;
    private final double RATEFORINDIVIDUALS = 0.1;

    public double depositReward(double amount, int duration, String clientType) {
        if (clientType.equals("individual")) {
            return amount + amount * RATEFORINDIVIDUALS * duration / 12.0;
        } else if (clientType.equals("legalEntity")) {
            return amount + amount * RATEFORLEGALENTITIES * duration / 12.0;
        } else {
            System.out.println("Error: Invalid client type!");
            return 0;
        }
    }
}
