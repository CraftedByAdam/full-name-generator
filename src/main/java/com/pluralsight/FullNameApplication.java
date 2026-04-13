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

        scanner.close();


        }
    }
