package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = read.nextLine().trim();

        System.out.print("Enter your middle name (if any): ");
        String middleName = read.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = read.nextLine().trim();

        System.out.print("Enter your suffix (if any): ");
        String suffix = read.nextLine().trim();

        // Build the full name
        String fullName = firstName;

        // Checks if middle name is not empty, then adds to full name
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        // User will always have last name
        fullName += " " + lastName;

        // Checks if user has a suffix to add along with a comma
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);

        read.close();
    }
}
