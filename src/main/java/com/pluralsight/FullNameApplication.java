package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static void main() {
        System.out.print("What is your name? Press Enter to Start");
        Scanner scanner = new Scanner(System.in);


        String firstName = scanner.nextLine();
        System.out.println("First Name: ");

        String middleInitial = scanner.next();
        System.out.println("Middle Initial: ");

        String lastName = scanner.nextLine();
        System.out.println("Last Name: ");
        scanner.nextLine();

        System.out.println(firstName + " " + middleInitial + ", " + lastName);
        scanner.close();
        String fullName = "";



    }
}
