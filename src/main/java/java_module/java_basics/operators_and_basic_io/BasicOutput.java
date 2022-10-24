package java_module.java_basics.operators_and_basic_io;

public class BasicOutput {
    public static void main(String[] args) {
        // Example 1 - print() vs println()

        // Prints output and moves the cursor to the beginning of the next line
        System.out.println("Welcome to Guidemy!");
        // Prints output and moves the cursor to the beginning of the next line
        System.out.println("Welcome to our Java bootcamp!");

        // Prints output only
        System.out.print("Learn Java Programming. ");
        // Prints output only
        System.out.print("Land your dream job in the tech industry!");

        // Moves the cursor to the beginning of the next line
        System.out.println();

        // Prints output and moves the cursor to the beginning of the next line
        System.out.println("Good Luck!");


        // Example 2 - printf()

        int year = 2022;
        String title = "instructor";
        String name = "Caspar";

        // Prints output by string concatenation
        System.out.println("This is the year of " + year + ".");

        // Prints output with arguments
        System.out.printf("Hello, I am your %s, %s.\n", title, name);

        // Prints output and moves the cursor to the beginning of the next line
        System.out.println("Any questions please feel free to ask.");
    }
}
