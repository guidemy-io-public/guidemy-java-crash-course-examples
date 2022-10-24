package java_module.java_basics.data_types;

public class StringExamples {
    public static void main(String[] args) {
        // Creating String objects
        String name1 = "Guidemy";
        String name2 = new String("Guidemy");

        System.out.println("Are they the same object? " + (name1 == name2));
        System.out.println("Do they have the same content? " + (name1.equals(name2)));

        // Getting the Length of a String

        String str1 = "Guidemy";
        String str2 = "Guidemy Institute of Technology";

        System.out.println("The length of str1 is " + str1.length());
        System.out.println("The length of str2 is " + str2.length());

        // Concatenating Strings

        String value1 = "Java";
        String value2 = "Programming";
        System.out.println(value1 + " " + value2);

        // Accessing Strings
        String school = "Guidemy Institute of Technology";

        System.out.println("Character at the 0 index: " + school.charAt(0));
        System.out.println("Index of the 'T' character: " + school.indexOf('T'));
        System.out.println("Contains substring 'Tech'? " + school.contains("Tech"));
        System.out.println("Is the string empty? " + school.isEmpty());

        // Manipulating Strings
        String greeting = "Hello World World";

        greeting.toLowerCase();  // result ignored
        System.out.println(greeting);  // "Hello World World"

        greeting = greeting.toUpperCase();
        System.out.println(greeting);  // "HELLO WORLD WORLD"

        greeting = greeting.substring(0, 11);
        System.out.println(greeting);  // "Hello WORLD"

        greeting = greeting.replace("WORLD", "Caspar");
        System.out.println(greeting);  // "Hello Caspar"

        // Converting String into Char Array
        String farewell = "goodbye.";
        System.out.println("Old farewell: " + farewell);

        char[] charArray = farewell.toCharArray();

        charArray[0] = 'G';
        charArray[7] = '!';

        String newFarewell = String.valueOf(charArray);
        System.out.println("New farewell: " + newFarewell);

        // Method Chaining
        String input = "   Let's chain the methods.   ";

        String output = input
                .trim()
                .replace("Let's chain", "We've chained")
                .replace(".", "!!!")
                .toUpperCase();

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);

        // Escape Character in Strings

//        String example1 = "This is our "Java" bootcamp";   // does not compile

        String example2 = "This is our \"Java\" bootcamp";

        System.out.println(example2);
    }
}
