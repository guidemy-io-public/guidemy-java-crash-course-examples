package java_module.java_basics.data_types;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting
        int intValue = 32700;
        double newDoubleValue = intValue;
        System.out.println(newDoubleValue);  // prints 32700.0

        // Narrowing Casting
        long longValue = 100_000_000_000L;
        int newIntValue = (int) longValue;
        System.out.println(newIntValue);  // prints 1215752192
    }
}
