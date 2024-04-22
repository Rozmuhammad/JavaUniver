// Task 1

// public class lab8 {

//     public static void main(String args[]) {
//         lab8 C = new lab8();
//         System.out.println(C.vozvrat("deified"));
//     }

//     public Boolean vozvrat(String A) {
//         String K = "";

//         for (int l = 0; l < A.length(); l++) {
//             if (Character.isLetterOrDigit(A.charAt(l))) {
//                 K += A.charAt(l);
//             }
//         }

//         char[] mass = K.toCharArray();
//         char[] mass2 = new char[mass.length];

//         int j = 0;
//         for (int i = mass.length - 1; i >= 0; i--) {
//             mass2[j++] = mass[i];
//         }

//         String B = new String(mass2);
//         return B.equalsIgnoreCase(K);
//     }
// }

// Task 2
// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.HashSet;

// public class lab8 {

//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         ArrayList<Number> numbers = new ArrayList<>();

//         Boolean run = true;
//         while (run) {
//             System.out.println("System Menu:");
//             System.out.println("1. Add Numbers");
//             System.out.println("2. All Number without duplicate");
//             System.out.println("3. Exit");
//             int choice = scanner.nextInt();
//             scanner.nextLine();

//             switch (choice) {
//                 case 1:
//                     addNumber(scanner, numbers);
//                     break;
//                 case 2:
//                     removeDuplicates(numbers);
//                     printNumbers(numbers);
//                     break;
//                 case 3:
//                     System.out.println("Exiting...");
//                     run = false;
//                     break;
//                 default:
//                     System.out.println("You need write number 1-2");
//                     break;
//             }
//         }
//     }

//     private static void addNumber(Scanner scanner, ArrayList<Number> numbers) {
//         System.out.print("Enter number: ");
//         int num = scanner.nextInt();
//         scanner.nextLine();

//         numbers.add(num);
//     }

//     private static void removeDuplicates(ArrayList<Number> numbers) {
//         HashSet<Number> uniqueNumbers = new HashSet<>(numbers);
//         numbers.clear();
//         numbers.addAll(uniqueNumbers);
//     }

//     private static void printNumbers(ArrayList<Number> numbers) {
//         System.out.println("Numbers without duplicates:");
//         for (Number number : numbers) {
//             System.out.println(number);
//         }
//     }
// }

// Task 3
// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.HashSet;

// public class lab8 {

// public static void main(String args[]) {
// Scanner scanner = new Scanner(System.in);
// ArrayList<String> strings = new ArrayList<>();

// Boolean run = true;
// while (run) {
// System.out.println("System Menu:");
// System.out.println("1. Add Strings");
// System.out.println("2. All Strings without duplicate");
// System.out.println("3. Exit");
// int choice = scanner.nextInt();
// scanner.nextLine();

// switch (choice) {
// case 1:
// addString(scanner, strings);
// break;
// case 2:
// removeDuplicates(strings);
// printStrings(strings);
// break;
// case 3:
// System.out.println("Exiting...");
// run = false;
// break;
// default:
// System.out.println("You need to write 1, 2, or 3");
// break;
// }
// }
// }

// private static void addString(Scanner scanner, ArrayList<String> strings) {
// System.out.print("Enter String: ");
// String str = scanner.nextLine();
// strings.add(str);
// }

// private static void removeDuplicates(ArrayList<String> strings) {
// HashSet<String> uniqueStrings = new HashSet<>(strings);
// strings.clear();
// strings.addAll(uniqueStrings);
// }

// private static void printStrings(ArrayList<String> strings) {
// System.out.println("Strings without duplicates:");
// for (String string : strings) {
// System.out.println(string);
// }
// }
// }

// Task 4
// import java.util.*;

// public class lab8 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter decimal number:");
// int decimal = scanner.nextInt();
// String binary = Integer.toBinaryString(decimal);
// String octal = Integer.toOctalString(decimal);
// String hex = Integer.toHexString(decimal);

// System.out.println("Binary: " + binary);
// System.out.println("Octal: " + octal);
// System.out.println("Hexadecimal: " + hex);

// // Example arithmetic operation
// int sum = decimal + Integer.parseInt(binary, 2);
// System.out.println("Sum of decimal and binary: " + sum);

// scanner.close();
// }
// }

// Task 5
// import java.util.*;

// public class lab8 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Map to store letter grades and their frequencies
// Map<Character, Integer> gradeFrequency = new HashMap<>();
// gradeFrequency.put('A', 0);
// gradeFrequency.put('B', 0);
// gradeFrequency.put('C', 0);
// gradeFrequency.put('D', 0);
// gradeFrequency.put('F', 0);

// // Example list of student scores
// List<Integer> scores = Arrays.asList(90, 85, 78, 92, 65, 88, 70, 95, 82, 75);

// // Calculate letter grade and update frequency
// for (int score : scores) {
// char grade = calculateGrade(score);
// gradeFrequency.put(grade, gradeFrequency.get(grade) + 1);
// }

// // Print frequency of letter grades
// System.out.println("Grade frequency:");
// for (Map.Entry<Character, Integer> entry : gradeFrequency.entrySet()) {
// System.out.println(entry.getKey() + ": " + entry.getValue());
// }

// scanner.close();
// }

// private static char calculateGrade(int score) {
// if (score >= 90) {
// return 'A';
// } else if (score >= 80) {
// return 'B';
// } else if (score >= 70) {
// return 'C';
// } else if (score >= 60) {
// return 'D';
// } else {
// return 'F';
// }
// }
// }
