// Exercises 1

// import java.util.Scanner;

// public class lab3 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Employee time work A: ");
// int A = scanner.nextInt();

// double end = 0;

// if (A > 0) {
// if (A <= 40) {
// end = A * 8;
// }

// if (A > 40) {
// end = (8 * 40) + ((A - 40) * (8 * 1.5));
// }
// System.out.println("Employee Bank $" + end);
// } else {
// System.out.println("Warning");
// }

// if (A > 60) {
// System.out.println("Employee Bank None");
// }

// scanner.close();
// }
// }

// Exercices 2

import java.util.Scanner;
import java.util.Arrays;

public class lab3 {
    public static void main(String[] args) {
        // Creating a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Creating arrays to store names and times of participants
        String[] names = new String[3];
        int[] times = new int[3];

        // Inputting data for each participant
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name " + (i + 1) + ":");
            names[i] = scanner.nextLine();

            System.out.println("Enter the time " + (i + 1) + ":");
            times[i] = scanner.nextInt();
            scanner.nextLine(); // Reading the newline character after inputting time
        }

        // Sorting participants by time
        sortRunners(names, times);

        // Outputting results
        System.out.println("The fastest: " + names[0] + ", time: " + times[0]);
        System.out.println("The second fastest : " + names[1] + ", time: " +
                times[1]);
        System.out.println("The third fastest : " + names[2] + ", time: " +
                times[2]);

        // Closing the scanner
        scanner.close();
    }

    // Method to sort participants by time
    public static void sortRunners(String[] names, int[] times) {
        Arrays.sort(times);
        Arrays.sort(names);
    }
}
