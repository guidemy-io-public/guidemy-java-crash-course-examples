package java_module.java_basics.operators_and_basic_io;

public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators

        // declare and initialize variables
        int a = 36, b = 7;

        // addition
        System.out.println("a + b = " + (a + b));

        // subtraction
        System.out.println("a - b = " + (a - b));

        // multiplication
        System.out.println("a * b = " + (a * b));

        // division
        System.out.println("a / b = " + (a / b));

        // modulo
        System.out.println("a % b = " + (a % b));

        // division operator
        System.out.println("(36 / 2) = " + (36 / 2));
        System.out.println("(36.0 / 2) = " + (36.0 / 2));
        System.out.println("(36 / 2.0) = " + (36 / 2.0));
        System.out.println("(36.0 / 2.0) = " + (36.0 / 2.0));

        // 2. Assignment Operators

        int x, y = 3;

        // assign value using =
        x = y;
        System.out.println("x = y, x = " + x);

        // assign value using +=
        x += y;
        System.out.println("x += y, x = " + x);

        // assign value using *=
        x *= y;
        System.out.println("x *= y, x = " + x);

        // 3. Comparison Operators

        int e = 18, f = 20;

        System.out.println("e = " + e + " and f = " + f);

        // == operator
        System.out.println("e == f -> " + (e == f));

        // != operator
        System.out.println("e != f -> " + (e != f));

        // > operator
        System.out.println("e > f -> " + (e > f));

        // < operator
        System.out.println("e < f -> " + (e < f));

        // >= operator
        System.out.println("e >= f -> " + (e >= f));

        // <= operator
        System.out.println("e <= f -> " + (e <= f));

        // 4. Logical Operators

        int g = 7;

        System.out.println("g = " + g);

        // Logical AND
        System.out.println("(g > 5 && x < 10) -> " + (g > 5 && g < 10));

        // Logical OR
        System.out.println("(g > 5 || x < 10) -> " + (g > 5 || g < 10));

        // Logical NOT
        System.out.println("!(g > 5 && x < 10) -> " + !(g > 5 && g < 10));

        // 5. Unary Operator - Prefix vs Postfix
        int var1 = 7, var2 = 7;

        System.out.println("var1 = " + var1 + " and var2 = " + var2);

        // increments var1 by 1 first, then prints 8
        System.out.println("++var1 is " + (++var1));

        // prints var2 first, then increments var2 by 1
        System.out.println("var2++ is " + (var2++));
        System.out.println("var2 = " + var2);  // prints 8

        // instanceof Operator
        String name = "Guidemy";

        // Checks whether name is an instanceof the String class
        boolean result = name instanceof String;
        System.out.println("Is name an object of String? " + result);

        // Ternary Operator
        String output = result ? "Yes" : "No";
        System.out.println("Is name an object of String? " + output);

        // Operator Precedence
        System.out.println("3 * 2 + 1 = " + (3 * 2 + 1));  // prints 7

        System.out.println("3 * (2 + 1) = " + (3 * (2 + 1)));  // prints 9
    }
}
