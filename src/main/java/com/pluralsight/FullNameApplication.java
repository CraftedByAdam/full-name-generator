package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        System.out.println("First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Middle Initial: ");
        String middleInitial = scanner.nextLine().trim();

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if (!middleInitial.isBlank()) {
            fullName += " " + middleInitial.charAt(0) + ".";
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("\nFull Name: " + fullName);

        scanner.close();


        }
    }
