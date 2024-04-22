
// Exercises 1
// import java.util.Scanner;

// public class lab2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Prompt user for input
// System.out.print("first num A: ");
// int A = scanner.nextInt();
// System.out.print("second num B: ");
// int B = scanner.nextInt();

// int result = 0;

// // Multiply A by B using repeated addition
// for (int i = 0; i < Math.abs(B); i++) {
// result += A;
// }

// // Print the final result
// System.out.println("Final result: " + result);

// scanner.close();
// }
// }

// Exercises 2
// import java.util.Scanner;

// public class lab2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// int sum = 0;
// int count = 0;

// // Read numbers until 0 is entered and calculate sum and count
// while (true) {
// System.out.print("Num A: ");
// int A = scanner.nextInt();

// if (A == 0) {
// break;
// }

// sum += A;
// count++;
// }

// // Print average and count if count is not zero
// if (count == 0) {
// System.out.println("Zero");
// } else {
// double average = (double) sum / count;
// System.out.println("Average" + average);
// System.out.println("Sum" + count);
// }

// scanner.close();
// }
// }

// Exercises 3
// import java.util.Scanner;

// public class lab2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// int count = 0;
// int MaxNum = 0;

// // Read numbers until 0 is entered and find the maximum number
// while (true) {
// System.out.print("Num A: ");
// int A = scanner.nextInt();

// if (A == 0) {
// break;
// }

// count++;
// if (A > MaxNum) {
// MaxNum = A;
// }
// }

// // Print the maximum number if count is not zero
// if (count == 0) {
// System.out.println("Zero");
// } else {
// System.out.println("Max number" + MaxNum);
// }

// scanner.close();
// }
// }

// Exercises 4
// import java.util.Scanner;

// public class lab2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter a number N: ");
// int N = scanner.nextInt();

// // Calculate the sum of the first N odd numbers
// int sum = calculateSum(N);

// // Print the final sum
// System.out.println("Sum " + N + " final: " + sum);

// scanner.close();
// }

// // Method to calculate the sum of the first N odd numbers
// public static int calculateSum(int N) {
// int sum = 0;
// int currentNumber = 1;

// for (int i = 0; i < N; i++) {
// sum += currentNumber; // Adding the current number to the sum
// currentNumber += 2; // Increasing the current number by 2 to get the next odd
// }

// return sum;
// }
// }

// Exercices 5
// import java.util.Scanner;

// public class lab2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// int sum = 0;
// int number;

// // Read numbers until 0 is entered and calculate sum of odd numbers
// do {
// System.out.print("Enter number: ");
// number = scanner.nextInt();

// if (number % 2 != 0) {
// sum += number; // If the number is odd, add it to the sum
// }
// } while (number != 0);

// // Print the final sum
// System.out.println("Sum: " + sum);

// scanner.close();
// }
// }

// Exercises 6
// import java.util.Scanner;

// public class lab2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Num A: ");
// int A = scanner.nextInt();
// System.out.print("Num B: ");
// int B = scanner.nextInt();
// System.out.print("Num C: ");
// int C = scanner.nextInt();
// int MaxNum = A;

// // Find the maximum number among A, B, and C
// if (B > MaxNum) {
// MaxNum = B;
// }
// if (C > MaxNum) {
// MaxNum = C;
// }

// // Print the maximum number
// System.out.println("Max number" + MaxNum);

// scanner.close();
// }
// }

// Exercises 7
// import java.util.Scanner;

// public class lab2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Srting: ");
// String input = scanner.nextLine();

// // Count the number of vowels in the input string
// int vowelsCount = countVowels(input);
// System.out.println("Sum Vowels: " + vowelsCount);

// scanner.close();
// }

// // Method to count the number of vowels in a string
// public static int countVowels(String input) {
// int count = 0;

// for (int i = 0; i < input.length(); i++) {
// char ch = Character.toLowerCase(input.charAt(i)); // Changing to lowercase

// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// count++;
// }
// }

// return count;
// }
// }

// Exercises 8
// import java.util.ArrayList;

// public class lab2 {
// public static void main(String[] args) {
// String[] inputArray = { "Hello", "world", "programming", "Java", "OpenAI",
// "zeeeero" };

// // Call the method to filter strings with more than 4 vowels
// String[] resultArray = filterStringsWithMoreThanFourVowels(inputArray);

// System.out.println("Strings with more than 4 vowels:");
// for (String str : resultArray) {
// System.out.println(str);
// }
// }

// // Method to filter strings with more than 4 vowels
// public static String[] filterStringsWithMoreThanFourVowels(String[]
// inputArray) {
// ArrayList<String> resultList = new ArrayList<>();

// // Iterate through each string in the input array
// for (String str : inputArray) {
// // If the count of vowels in the string is greater than 4, add it to the
// result
// // list
// if (countVowels(str) > 4) {
// resultList.add(str);
// }
// }

// // Convert ArrayList to array of strings
// String[] resultArray = new String[resultList.size()];
// resultArray = resultList.toArray(resultArray);

// return resultArray;
// }

// // Method to count the number of vowels in a string
// public static int countVowels(String str) {
// int count = 0;
// str = str.toLowerCase(); // Convert the string to lowercase to account for
// all vowels

// // Iterate through each character in the string
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// // Increment the count if the character is a vowel
// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// count++;
// }
// }

// return count;
// }
// }

// Exercices 9
// public class lab2 {
// public static void main(String[] args) {
// String text1 = "Hello world";
// String text2 = "world";

// // Check if text1 contains text2
// String result = containsSubstring(text1, text2);
// System.out.println(result);
// }

// // Method to check if a string contains another string
// public static String containsSubstring(String text1, String text2) {
// if (text1.contains(text2)) {
// return "YES";
// } else {
// return "NO";
// }
// }
// }

// Exercices 10
// public class lab2 {
// public static void main(String[] args) {
// String input = "wow";

// // Check if the input string is a palindrome
// String result = checkIfPalindrome(input);

// System.out.println(result);
// }

// // Method to check if a string is a palindrome
// public static String checkIfPalindrome(String str) {
// // Reverse the input string
// String reversed = reverseString(str);

// // Check if the original string is equal to the reversed string
// if (str.equals(reversed)) {
// return "YES";
// } else {
// return "NO";
// }
// }

// // Method to reverse a string
// public static String reverseString(String str) {
// StringBuilder reversed = new StringBuilder();

// for (int i = str.length() - 1; i >= 0; i--) {
// reversed.append(str.charAt(i));
// }

// return reversed.toString();
// }
// }
