package java_module.java_basics.data_types;

public class PrimitiveOverflow {
    public static void main(String[] args) {
        int intValue = Integer.MAX_VALUE;
        int newIntValue = intValue + 1;
        System.out.println(newIntValue);  // prints -2147483648
    }
}
