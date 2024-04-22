import java.util.Scanner;

import lab4Loan.*;

public class lab4 {
    public static void main(String[] args) {
        // Instantiate necessary objects
        lab4NationalBank nationalBank = new lab4NationalBank();
        lab4SecondTierBank secondTierBank = new lab4SecondTierBank();
        Scanner scanner = new Scanner(System.in);

        // Add switch statement to choose between banks
        System.out.println("Choose bank:");
        System.out.println("1. National Bank");
        System.out.println("2. Second Tier Bank");
        int choice = scanner.nextInt();
        System.out.println("Choose client type:");
        System.out.println("1. Individual");
        System.out.println("2. Legal Entity");
        int clientChoice = scanner.nextInt();
        System.out.println("Enter deposit amount:");
        double amount = scanner.nextDouble();
        System.out.println("Enter deposit duration (in months):");
        int duration = scanner.nextInt();

        switch (choice) {
            case 1:
                // Calculate deposit reward for National Bank
                double nationalBankDepositReward = nationalBank.calculateDeposit(amount, duration, clientChoice);
                System.out.println("Deposit reward in National Bank: " + nationalBankDepositReward);
                break;
            case 2:
                // Calculate deposit reward for Second Tier Bank
                double secondTierBankDepositReward = secondTierBank.calculateDeposit(amount, duration, clientChoice);
                System.out.println("Deposit reward in Second Tier Bank: " + secondTierBankDepositReward);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
