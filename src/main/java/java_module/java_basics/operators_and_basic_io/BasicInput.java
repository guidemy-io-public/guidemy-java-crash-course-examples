package java_module.java_basics.operators_and_basic_io;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Example 1 - Scanner and nextInt()

        // Display a prompt to the user
        System.out.print("Enter an integer: ");

        // Take an integer input from the user
        int inputNumber = scanner.nextInt();

        // Display the user's input
        System.out.println("Your input is: " + inputNumber);


        // Example 2 - nextLong(), nextDouble() and nextDouble()

        // Get a long input
        System.out.print("Enter a long: ");
        float longInput = scanner.nextLong();
        System.out.println("Your long is " + longInput);

        // Get a float input
        System.out.print("Enter a float: ");
        float floatInput = scanner.nextFloat();
        System.out.println("Your float is " + floatInput);

        // Get a double input
        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();
        System.out.println("Your double is " + doubleInput);


        // Example 3 - next() and parseInt()

        // Display a prompt to the user
        System.out.print("Enter an integer: ");

        // Take a text input from the user
        String text = scanner.next();

        // Parse the text input as an integer
        int parsedNumber = Integer.parseInt(text);

        // Display the user's input
        System.out.println("Your input is: " + parsedNumber);

        // It is a good practice to close a resource after using it
        scanner.close();
    }
}
