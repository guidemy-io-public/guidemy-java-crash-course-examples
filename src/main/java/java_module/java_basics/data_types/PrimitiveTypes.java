package java_module.java_basics.data_types;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // 1. boolean type
        boolean shouldGreet = true;

        if (shouldGreet) {
            System.out.println("Hello World!");
        }

        // 2. byte type
        byte byteValue = 108;
        System.out.println(byteValue);  // prints 108

        // 3. short type
        short shortValue = -180;
        System.out.println(shortValue);  // prints -180

        // 4. int type
        int intValue = 2147483600;
        int intValueWithUnderscore = 2_147_483_600;
        System.out.println(intValue);  // prints 2147483600
        System.out.println(intValueWithUnderscore);  // prints 2147483600

        // 5. long type
        long longValue = -3200000800L;
        long longValueWithUnderscore = -3_200_000_800L;
        System.out.println(longValue);  // prints -3200000800
        System.out.println(longValueWithUnderscore);  // prints -3200000800

        // 6. double type
        double doubleValue = -273.15;
        System.out.println(doubleValue);  // prints -273.15

        // 7. float type
        float floatValue = -273.15f;
        System.out.println(floatValue);  // prints -273.15

        // 8. char type
        char charValue1 = '\u0037';
        char charValue2 = '7';
        char charValue3 = 55;

        System.out.println(charValue1);  // prints 7
        System.out.println(charValue2);  // prints 7
        System.out.println(charValue3);  // prints 7
    }
}
