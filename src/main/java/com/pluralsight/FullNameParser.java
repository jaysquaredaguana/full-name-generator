package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a name (first last or first middle last): ");
        String fullName = read.nextLine().trim();

        String[] nameParts = fullName.split("\\s+");

        // Checks if name is two part format (no middle)
        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);

        // Otherwise will check full format
        } else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);

        // Otherwise the format entered by user was not within constraint
        } else {
            System.out.println("Invalid name format. Please enter first last or first middle last.");
        }

        read.close();
    }
}
