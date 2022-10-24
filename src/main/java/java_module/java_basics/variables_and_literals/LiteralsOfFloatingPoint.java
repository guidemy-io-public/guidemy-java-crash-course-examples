package java_module.java_basics.variables_and_literals;

public class LiteralsOfFloatingPoint {
    public static void main(String[] args) {
        double doublePrice = 29.99;
        float floatPrice = 29.99f;

        // 2.99 * 10^2
        double scientificDoubleValue = 2.99e2;

        System.out.println(doublePrice);  // prints 29.99
        System.out.println(floatPrice);  // prints 29.99
        System.out.println(scientificDoubleValue);  // prints 299.0
    }
}
