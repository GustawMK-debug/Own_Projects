package PasswordChecker;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- PASSWORD MANAGER ---");
            System.out.println("1. Check password strength");
            System.out.println("2. Generate new password");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter password to check: ");
                    String password = scanner.nextLine();
                    int score = PasswordValidator.checkPasswordStrength(password);
                    System.out.println("Password strength: " + score + "/5");
                    break;
                case 2:
                    System.out.print("Enter desired password length: ");
                    int length = scanner.nextInt();
                    scanner.nextLine();
                    String generatedPassword = PasswordGenerator.generatePassword(length);
                    System.out.println("Your new password is: " + generatedPassword);
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        scanner.close();
    }
}