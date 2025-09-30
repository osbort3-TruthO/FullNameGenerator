package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        String fullName = firstName;

        if (!middleName.equals("")) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.equals("")) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);

        scanner.close();
    }
}


